package typings.entities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDecodeMod {
  
  @JSImport("entities/lib/decode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait BinTrieFlags extends StObject
  @JSImport("entities/lib/decode", "BinTrieFlags")
  @js.native
  object BinTrieFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[BinTrieFlags & Double] = js.native
    
    @js.native
    sealed trait BRANCH_LENGTH
      extends StObject
         with BinTrieFlags
    /* 16256 */ val BRANCH_LENGTH: typings.entities.libDecodeMod.BinTrieFlags.BRANCH_LENGTH & Double = js.native
    
    @js.native
    sealed trait JUMP_TABLE
      extends StObject
         with BinTrieFlags
    /* 127 */ val JUMP_TABLE: typings.entities.libDecodeMod.BinTrieFlags.JUMP_TABLE & Double = js.native
    
    @js.native
    sealed trait VALUE_LENGTH
      extends StObject
         with BinTrieFlags
    /* 49152 */ val VALUE_LENGTH: typings.entities.libDecodeMod.BinTrieFlags.VALUE_LENGTH & Double = js.native
  }
  
  @js.native
  sealed trait DecodingMode extends StObject
  @JSImport("entities/lib/decode", "DecodingMode")
  @js.native
  object DecodingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DecodingMode & Double] = js.native
    
    /** Entities in attributes have limitations on ending characters. */
    @js.native
    sealed trait Attribute
      extends StObject
         with DecodingMode
    /* 2 */ val Attribute: typings.entities.libDecodeMod.DecodingMode.Attribute & Double = js.native
    
    /** Entities in text nodes that can end with any character. */
    @js.native
    sealed trait Legacy
      extends StObject
         with DecodingMode
    /* 0 */ val Legacy: typings.entities.libDecodeMod.DecodingMode.Legacy & Double = js.native
    
    /** Only allow entities terminated with a semicolon. */
    @js.native
    sealed trait Strict
      extends StObject
         with DecodingMode
    /* 1 */ val Strict: typings.entities.libDecodeMod.DecodingMode.Strict & Double = js.native
  }
  
  @JSImport("entities/lib/decode", "EntityDecoder")
  @js.native
  open class EntityDecoder protected () extends StObject {
    def this(
      /** The tree used to decode entities. */
    decodeTree: js.typedarray.Uint16Array,
      /**
      * The function that is called when a codepoint is decoded.
      *
      * For multi-byte named entities, this will be called multiple times,
      * with the second codepoint, and the same `consumed` value.
      *
      * @param codepoint The decoded codepoint.
      * @param consumed The number of bytes consumed by the decoder.
      */
    emitCodePoint: js.Function2[/* cp */ Double, /* consumed */ Double, Unit]
    ) = this()
    def this(
      /** The tree used to decode entities. */
    decodeTree: js.typedarray.Uint16Array,
      /**
      * The function that is called when a codepoint is decoded.
      *
      * For multi-byte named entities, this will be called multiple times,
      * with the second codepoint, and the same `consumed` value.
      *
      * @param codepoint The decoded codepoint.
      * @param consumed The number of bytes consumed by the decoder.
      */
    emitCodePoint: js.Function2[/* cp */ Double, /* consumed */ Double, Unit],
      /** An object that is used to produce errors. */
    errors: EntityErrorProducer
    ) = this()
    
    /* private */ var addToNumericResult: Any = js.native
    
    /** Characters that were consumed while parsing an entity. */
    /* private */ var consumed: Any = js.native
    
    /** The mode in which the decoder is operating. */
    /* private */ var decodeMode: Any = js.native
    
    /** The tree used to decode entities. */
    /* private */ val decodeTree: Any = js.native
    
    /**
      * The function that is called when a codepoint is decoded.
      *
      * For multi-byte named entities, this will be called multiple times,
      * with the second codepoint, and the same `consumed` value.
      *
      * @param codepoint The decoded codepoint.
      * @param consumed The number of bytes consumed by the decoder.
      */
    /* private */ val emitCodePoint: Any = js.native
    
    /**
      * Emit a named entity.
      *
      * @param result The index of the entity in the decode tree.
      * @param valueLength The number of bytes in the entity.
      * @param consumed The number of characters consumed.
      *
      * @returns The number of characters consumed.
      */
    /* private */ var emitNamedEntityData: Any = js.native
    
    /**
      * Emit a named entity that was not terminated with a semicolon.
      *
      * @returns The number of characters consumed.
      */
    /* private */ var emitNotTerminatedNamedEntity: Any = js.native
    
    /**
      * Validate and emit a numeric entity.
      *
      * Implements the logic from the `Hexademical character reference start
      * state` and `Numeric character reference end state` in the HTML spec.
      *
      * @param lastCp The last code point of the entity. Used to see if the
      *               entity was terminated with a semicolon.
      * @param expectedLength The minimum number of characters that should be
      *                       consumed. Used to validate that at least one digit
      *                       was consumed.
      * @returns The number of characters that were consumed.
      */
    /* private */ var emitNumericEntity: Any = js.native
    
    /**
      * Signal to the parser that the end of the input was reached.
      *
      * Remaining data will be emitted and relevant errors will be produced.
      *
      * @returns The number of characters consumed.
      */
    def end(): Double = js.native
    
    /** An object that is used to produce errors. */
    /* private */ val errors: Any = js.native
    
    /** The number of characters that were consumed in excess. */
    /* private */ var excess: Any = js.native
    
    /**
      * The result of the entity.
      *
      * Either the result index of a numeric entity, or the codepoint of a
      * numeric entity.
      */
    /* private */ var result: Any = js.native
    
    /** Resets the instance to make it reusable. */
    def startEntity(decodeMode: DecodingMode): Unit = js.native
    
    /** The current state of the decoder. */
    /* private */ var state: Any = js.native
    
    /**
      * Parses a named entity.
      *
      * Equivalent to the `Named character reference state` in the HTML spec.
      *
      * @param str The string containing the entity (or a continuation of the entity).
      * @param offset The current offset.
      * @returns The number of characters that were consumed, or -1 if the entity is incomplete.
      */
    /* private */ var stateNamedEntity: Any = js.native
    
    /**
      * Parses a decimal numeric entity.
      *
      * Equivalent to the `Decimal character reference state` in the HTML spec.
      *
      * @param str The string containing the entity (or a continuation of the entity).
      * @param offset The current offset.
      * @returns The number of characters that were consumed, or -1 if the entity is incomplete.
      */
    /* private */ var stateNumericDecimal: Any = js.native
    
    /**
      * Parses a hexadecimal numeric entity.
      *
      * Equivalent to the `Hexademical character reference state` in the HTML spec.
      *
      * @param str The string containing the entity (or a continuation of the entity).
      * @param offset The current offset.
      * @returns The number of characters that were consumed, or -1 if the entity is incomplete.
      */
    /* private */ var stateNumericHex: Any = js.native
    
    /**
      * Switches between the numeric decimal and hexadecimal states.
      *
      * Equivalent to the `Numeric character reference state` in the HTML spec.
      *
      * @param str The string containing the entity (or a continuation of the entity).
      * @param offset The current offset.
      * @returns The number of characters that were consumed, or -1 if the entity is incomplete.
      */
    /* private */ var stateNumericStart: Any = js.native
    
    /** The current index in the decode tree. */
    /* private */ var treeIndex: Any = js.native
    
    /**
      * Write an entity to the decoder. This can be called multiple times with partial entities.
      * If the entity is incomplete, the decoder will return -1.
      *
      * Mirrors the implementation of `getDecoder`, but with the ability to stop decoding if the
      * entity is incomplete, and resume when the next string is written.
      *
      * @param string The string containing the entity (or a continuation of the entity).
      * @param offset The offset at which the entity begins. Should be 0 if this is not the first call.
      * @returns The number of characters that were consumed, or -1 if the entity is incomplete.
      */
    def write(str: String, offset: Double): Double = js.native
  }
  
  inline def decodeCodePoint(codePoint: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeCodePoint")(codePoint.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeHTML(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeHTML")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decodeHTML(str: String, mode: DecodingMode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeHTML")(str.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodeHTMLAttribute(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeHTMLAttribute")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeHTMLStrict(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeHTMLStrict")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeXML(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeXML")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def determineBranch(decodeTree: js.typedarray.Uint16Array, current: Double, nodeIdx: Double, char: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("determineBranch")(decodeTree.asInstanceOf[js.Any], current.asInstanceOf[js.Any], nodeIdx.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fromCodePoint(codePoints: Double*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(codePoints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  @JSImport("entities/lib/decode", "htmlDecodeTree")
  @js.native
  val htmlDecodeTree: js.typedarray.Uint16Array = js.native
  
  inline def replaceCodePoint(codePoint: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceCodePoint")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("entities/lib/decode", "xmlDecodeTree")
  @js.native
  val xmlDecodeTree: js.typedarray.Uint16Array = js.native
  
  trait EntityErrorProducer extends StObject {
    
    def absenceOfDigitsInNumericCharacterReference(consumedCharacters: Double): Unit
    
    def missingSemicolonAfterCharacterReference(): Unit
    
    def validateNumericCharacterReference(code: Double): Unit
  }
  object EntityErrorProducer {
    
    inline def apply(
      absenceOfDigitsInNumericCharacterReference: Double => Unit,
      missingSemicolonAfterCharacterReference: () => Unit,
      validateNumericCharacterReference: Double => Unit
    ): EntityErrorProducer = {
      val __obj = js.Dynamic.literal(absenceOfDigitsInNumericCharacterReference = js.Any.fromFunction1(absenceOfDigitsInNumericCharacterReference), missingSemicolonAfterCharacterReference = js.Any.fromFunction0(missingSemicolonAfterCharacterReference), validateNumericCharacterReference = js.Any.fromFunction1(validateNumericCharacterReference))
      __obj.asInstanceOf[EntityErrorProducer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EntityErrorProducer] (val x: Self) extends AnyVal {
      
      inline def setAbsenceOfDigitsInNumericCharacterReference(value: Double => Unit): Self = StObject.set(x, "absenceOfDigitsInNumericCharacterReference", js.Any.fromFunction1(value))
      
      inline def setMissingSemicolonAfterCharacterReference(value: () => Unit): Self = StObject.set(x, "missingSemicolonAfterCharacterReference", js.Any.fromFunction0(value))
      
      inline def setValidateNumericCharacterReference(value: Double => Unit): Self = StObject.set(x, "validateNumericCharacterReference", js.Any.fromFunction1(value))
    }
  }
}
