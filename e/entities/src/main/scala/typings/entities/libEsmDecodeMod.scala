package typings.entities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmDecodeMod {
  
  @JSImport("entities/lib/esm/decode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait BinTrieFlags extends StObject
  @JSImport("entities/lib/esm/decode", "BinTrieFlags")
  @js.native
  object BinTrieFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[BinTrieFlags & Double] = js.native
    
    @js.native
    sealed trait BRANCH_LENGTH
      extends StObject
         with BinTrieFlags
    /* 16256 */ val BRANCH_LENGTH: typings.entities.libEsmDecodeMod.BinTrieFlags.BRANCH_LENGTH & Double = js.native
    
    @js.native
    sealed trait JUMP_TABLE
      extends StObject
         with BinTrieFlags
    /* 127 */ val JUMP_TABLE: typings.entities.libEsmDecodeMod.BinTrieFlags.JUMP_TABLE & Double = js.native
    
    @js.native
    sealed trait VALUE_LENGTH
      extends StObject
         with BinTrieFlags
    /* 49152 */ val VALUE_LENGTH: typings.entities.libEsmDecodeMod.BinTrieFlags.VALUE_LENGTH & Double = js.native
  }
  
  inline def decodeCodePoint(codePoint: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeCodePoint")(codePoint.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeHTML(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeHTML")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeHTMLStrict(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeHTMLStrict")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeXML(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeXML")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def determineBranch(decodeTree: js.typedarray.Uint16Array, current: Double, nodeIdx: Double, char: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("determineBranch")(decodeTree.asInstanceOf[js.Any], current.asInstanceOf[js.Any], nodeIdx.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fromCodePoint(codePoints: Double*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(codePoints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  @JSImport("entities/lib/esm/decode", "htmlDecodeTree")
  @js.native
  val htmlDecodeTree: js.typedarray.Uint16Array = js.native
  
  inline def replaceCodePoint(codePoint: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceCodePoint")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("entities/lib/esm/decode", "xmlDecodeTree")
  @js.native
  val xmlDecodeTree: js.typedarray.Uint16Array = js.native
}
