package typings.draftJs.mod.Draft.Model

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.Draft.Model.Constants.DraftBlockType
import typings.draftJs.mod.Draft.Model.Constants.DraftEntityMutability
import typings.draftJs.mod.Draft.Model.Constants.DraftEntityType
import typings.draftJs.mod.Draft.Model.Constants.DraftInlineStyleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Encoding {
  
  /**
    * A plain object representation of a ContentBlock, with all style and entity
    * attribution repackaged as range objects.
    */
  trait RawDraftContentBlock extends StObject {
    
    var data: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var depth: Double
    
    var entityRanges: js.Array[RawDraftEntityRange]
    
    var inlineStyleRanges: js.Array[RawDraftInlineStyleRange]
    
    var key: String
    
    var text: String
    
    var `type`: DraftBlockType
  }
  object RawDraftContentBlock {
    
    inline def apply(
      depth: Double,
      entityRanges: js.Array[RawDraftEntityRange],
      inlineStyleRanges: js.Array[RawDraftInlineStyleRange],
      key: String,
      text: String,
      `type`: DraftBlockType
    ): RawDraftContentBlock = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], entityRanges = entityRanges.asInstanceOf[js.Any], inlineStyleRanges = inlineStyleRanges.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawDraftContentBlock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawDraftContentBlock] (val x: Self) extends AnyVal {
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setEntityRanges(value: js.Array[RawDraftEntityRange]): Self = StObject.set(x, "entityRanges", value.asInstanceOf[js.Any])
      
      inline def setEntityRangesVarargs(value: RawDraftEntityRange*): Self = StObject.set(x, "entityRanges", js.Array(value*))
      
      inline def setInlineStyleRanges(value: js.Array[RawDraftInlineStyleRange]): Self = StObject.set(x, "inlineStyleRanges", value.asInstanceOf[js.Any])
      
      inline def setInlineStyleRangesVarargs(value: RawDraftInlineStyleRange*): Self = StObject.set(x, "inlineStyleRanges", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: DraftBlockType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A type that represents a composed document as vanilla JavaScript objects,
    * with all styles and entities represented as ranges. Corresponding entity
    * objects are packaged as objects as well.
    *
    * This object is especially useful when sending the document state to the
    * server for storage, as its representation is more concise than our
    * immutable objects.
    */
  trait RawDraftContentState extends StObject {
    
    var blocks: js.Array[RawDraftContentBlock]
    
    var entityMap: StringDictionary[RawDraftEntity[StringDictionary[Any]]]
  }
  object RawDraftContentState {
    
    inline def apply(
      blocks: js.Array[RawDraftContentBlock],
      entityMap: StringDictionary[RawDraftEntity[StringDictionary[Any]]]
    ): RawDraftContentState = {
      val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], entityMap = entityMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawDraftContentState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawDraftContentState] (val x: Self) extends AnyVal {
      
      inline def setBlocks(value: js.Array[RawDraftContentBlock]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksVarargs(value: RawDraftContentBlock*): Self = StObject.set(x, "blocks", js.Array(value*))
      
      inline def setEntityMap(value: StringDictionary[RawDraftEntity[StringDictionary[Any]]]): Self = StObject.set(x, "entityMap", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A plain object representation of an EntityInstance.
    */
  trait RawDraftEntity[T] extends StObject {
    
    var data: T
    
    var mutability: DraftEntityMutability
    
    var `type`: DraftEntityType
  }
  object RawDraftEntity {
    
    inline def apply[T](data: T, mutability: DraftEntityMutability, `type`: DraftEntityType): RawDraftEntity[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mutability = mutability.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawDraftEntity[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawDraftEntity[?], T] (val x: Self & RawDraftEntity[T]) extends AnyVal {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMutability(value: DraftEntityMutability): Self = StObject.set(x, "mutability", value.asInstanceOf[js.Any])
      
      inline def setType(value: DraftEntityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A plain object representation of an entity attribution.
    *
    * The `key` value corresponds to the key of the entity in the `entityMap` of
    * a `ComposedText` object, not for use with `DraftEntity.get()`.
    */
  trait RawDraftEntityRange extends StObject {
    
    var key: Double
    
    var length: Double
    
    var offset: Double
  }
  object RawDraftEntityRange {
    
    inline def apply(key: Double, length: Double, offset: Double): RawDraftEntityRange = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawDraftEntityRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawDraftEntityRange] (val x: Self) extends AnyVal {
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A plain object representation of an inline style range.
    */
  trait RawDraftInlineStyleRange extends StObject {
    
    var length: Double
    
    var offset: Double
    
    var style: DraftInlineStyleType
  }
  object RawDraftInlineStyleRange {
    
    inline def apply(length: Double, offset: Double, style: DraftInlineStyleType): RawDraftInlineStyleRange = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawDraftInlineStyleRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawDraftInlineStyleRange] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: DraftInlineStyleType): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
