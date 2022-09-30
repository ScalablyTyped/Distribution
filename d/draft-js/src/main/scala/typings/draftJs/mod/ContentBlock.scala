package typings.draftJs.mod

import typings.draftJs.mod.Draft.Model.Constants.DraftBlockType
import typings.draftJs.mod.Draft.Model.ImmutableData.DraftInlineStyle
import typings.immutable.mod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "ContentBlock")
@js.native
open class ContentBlock ()
  extends StObject
     with typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock {
  
  /**
    * Execute a callback for every contiguous range of entities within the block.
    */
  /* CompleteClass */
  override def findEntityRanges(
    filterFn: js.Function1[
      /* value */ typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, 
      Boolean
    ],
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit]
  ): Unit = js.native
  
  /**
    * Execute a callback for every contiguous range of styles within the block.
    */
  /* CompleteClass */
  override def findStyleRanges(
    filterFn: js.Function1[
      /* value */ typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, 
      Boolean
    ],
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit]
  ): Unit = js.native
  
  /* CompleteClass */
  override def getCharacterList(): typings.immutable.mod.List[typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata] = js.native
  
  /* CompleteClass */
  override def getData(): Map[Any, Any] = js.native
  
  /* CompleteClass */
  override def getDepth(): Double = js.native
  
  /* CompleteClass */
  override def getEntityAt(offset: Double): String = js.native
  
  /* CompleteClass */
  override def getInlineStyleAt(offset: Double): DraftInlineStyle = js.native
  
  /* CompleteClass */
  override def getKey(): String = js.native
  
  /* CompleteClass */
  override def getLength(): Double = js.native
  
  /* CompleteClass */
  override def getText(): String = js.native
  
  /* CompleteClass */
  override def getType(): DraftBlockType = js.native
}
