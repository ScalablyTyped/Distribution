package typings.draftJs.mod.Draft.Model

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.Draft.Model.Constants.DraftBlockType
import typings.draftJs.mod.Draft.Model.Constants.DraftEntityMutability
import typings.draftJs.mod.Draft.Model.Constants.DraftEntityType
import typings.draftJs.mod.Draft.Model.Constants.DraftInlineStyleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Encoding {
  
  /**
    * A plain object representation of a ContentBlock, with all style and entity
    * attribution repackaged as range objects.
    */
  @js.native
  trait RawDraftContentBlock extends StObject {
    
    var data: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var depth: Double = js.native
    
    var entityRanges: js.Array[RawDraftEntityRange] = js.native
    
    var inlineStyleRanges: js.Array[RawDraftInlineStyleRange] = js.native
    
    var key: String = js.native
    
    var text: String = js.native
    
    var `type`: DraftBlockType = js.native
  }
  object RawDraftContentBlock {
    
    @scala.inline
    def apply(
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
    implicit class RawDraftContentBlockMutableBuilder[Self <: RawDraftContentBlock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityRanges(value: js.Array[RawDraftEntityRange]): Self = StObject.set(x, "entityRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityRangesVarargs(value: RawDraftEntityRange*): Self = StObject.set(x, "entityRanges", js.Array(value :_*))
      
      @scala.inline
      def setInlineStyleRanges(value: js.Array[RawDraftInlineStyleRange]): Self = StObject.set(x, "inlineStyleRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineStyleRangesVarargs(value: RawDraftInlineStyleRange*): Self = StObject.set(x, "inlineStyleRanges", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: DraftBlockType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
  @js.native
  trait RawDraftContentState extends StObject {
    
    var blocks: js.Array[RawDraftContentBlock] = js.native
    
    var entityMap: StringDictionary[RawDraftEntity[StringDictionary[_]]] = js.native
  }
  object RawDraftContentState {
    
    @scala.inline
    def apply(
      blocks: js.Array[RawDraftContentBlock],
      entityMap: StringDictionary[RawDraftEntity[StringDictionary[_]]]
    ): RawDraftContentState = {
      val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], entityMap = entityMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawDraftContentState]
    }
    
    @scala.inline
    implicit class RawDraftContentStateMutableBuilder[Self <: RawDraftContentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocks(value: js.Array[RawDraftContentBlock]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocksVarargs(value: RawDraftContentBlock*): Self = StObject.set(x, "blocks", js.Array(value :_*))
      
      @scala.inline
      def setEntityMap(value: StringDictionary[RawDraftEntity[StringDictionary[_]]]): Self = StObject.set(x, "entityMap", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A plain object representation of an EntityInstance.
    */
  @js.native
  trait RawDraftEntity[T] extends StObject {
    
    var data: T = js.native
    
    var mutability: DraftEntityMutability = js.native
    
    var `type`: DraftEntityType = js.native
  }
  object RawDraftEntity {
    
    @scala.inline
    def apply[T](data: T, mutability: DraftEntityMutability, `type`: DraftEntityType): RawDraftEntity[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mutability = mutability.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawDraftEntity[T]]
    }
    
    @scala.inline
    implicit class RawDraftEntityMutableBuilder[Self <: RawDraftEntity[_], T] (val x: Self with RawDraftEntity[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutability(value: DraftEntityMutability): Self = StObject.set(x, "mutability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: DraftEntityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A plain object representation of an entity attribution.
    *
    * The `key` value corresponds to the key of the entity in the `entityMap` of
    * a `ComposedText` object, not for use with `DraftEntity.get()`.
    */
  @js.native
  trait RawDraftEntityRange extends StObject {
    
    var key: Double = js.native
    
    var length: Double = js.native
    
    var offset: Double = js.native
  }
  object RawDraftEntityRange {
    
    @scala.inline
    def apply(key: Double, length: Double, offset: Double): RawDraftEntityRange = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawDraftEntityRange]
    }
    
    @scala.inline
    implicit class RawDraftEntityRangeMutableBuilder[Self <: RawDraftEntityRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A plain object representation of an inline style range.
    */
  @js.native
  trait RawDraftInlineStyleRange extends StObject {
    
    var length: Double = js.native
    
    var offset: Double = js.native
    
    var style: DraftInlineStyleType = js.native
  }
  object RawDraftInlineStyleRange {
    
    @scala.inline
    def apply(length: Double, offset: Double, style: DraftInlineStyleType): RawDraftInlineStyleRange = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawDraftInlineStyleRange]
    }
    
    @scala.inline
    implicit class RawDraftInlineStyleRangeMutableBuilder[Self <: RawDraftInlineStyleRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: DraftInlineStyleType): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
