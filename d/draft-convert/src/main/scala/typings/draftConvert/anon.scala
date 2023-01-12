package typings.draftConvert

import typings.draftConvert.mod.EntityKey
import typings.draftConvert.mod._Tag
import typings.draftJs.mod.Draft.Model.Constants.DraftBlockType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data[B /* <: DraftBlockType */] extends StObject {
    
    var data: js.Object
    
    var `type`: B
  }
  object Data {
    
    inline def apply[B /* <: DraftBlockType */](data: js.Object, `type`: B): Data[B] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[B]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data[?], B /* <: DraftBlockType */] (val x: Self & Data[B]) extends AnyVal {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: B): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Element
    extends StObject
       with _Tag {
    
    var element: ReactNode
    
    var empty: js.UndefOr[ReactNode] = js.undefined
  }
  object Element {
    
    inline def apply(): Element = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      inline def setElement(value: ReactNode): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEmpty(value: ReactNode): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    }
  }
  
  trait Empty
    extends StObject
       with _Tag {
    
    var empty: js.UndefOr[String] = js.undefined
    
    var end: String
    
    var start: String
  }
  object Empty {
    
    inline def apply(end: String, start: String): Empty = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Empty]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Empty] (val x: Self) extends AnyVal {
      
      inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Entity extends StObject {
    
    var entity: EntityKey
    
    var length: Double
    
    var offset: Double
    
    var result: js.UndefOr[String] = js.undefined
  }
  object Entity {
    
    inline def apply(entity: EntityKey, length: Double, offset: Double): Entity = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
      
      inline def setEntity(value: EntityKey): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
