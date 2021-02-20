package typings.draftConvert

import typings.draftConvert.mod.EntityKey
import typings.draftConvert.mod._Tag
import typings.draftJs.mod.Draft.Model.Constants.DraftBlockType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Data extends StObject {
    
    var data: js.Object = js.native
    
    var `type`: DraftBlockType = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: js.Object, `type`: DraftBlockType): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: DraftBlockType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Element extends _Tag {
    
    var element: ReactNode = js.native
    
    var empty: js.UndefOr[ReactNode] = js.native
  }
  object Element {
    
    @scala.inline
    def apply(): Element = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: ReactNode): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setEmpty(value: ReactNode): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    }
  }
  
  @js.native
  trait Empty extends _Tag {
    
    var empty: js.UndefOr[String] = js.native
    
    var end: String = js.native
    
    var start: String = js.native
  }
  object Empty {
    
    @scala.inline
    def apply(end: String, start: String): Empty = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Empty]
    }
    
    @scala.inline
    implicit class EmptyMutableBuilder[Self <: Empty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      @scala.inline
      def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Entity extends StObject {
    
    var entity: EntityKey = js.native
    
    var length: Double = js.native
    
    var offset: Double = js.native
    
    var result: js.UndefOr[String] = js.native
  }
  object Entity {
    
    @scala.inline
    def apply(entity: EntityKey, length: Double, offset: Double): Entity = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entity]
    }
    
    @scala.inline
    implicit class EntityMutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntity(value: EntityKey): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
