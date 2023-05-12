package typings.fluentuiReactCompose

import typings.fluentuiReactCompose.anon.Children
import typings.react.mod.ElementType
import typings.react.mod.ReactChild
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactPortal
import typings.react.mod.Ref
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNextTypesMod {
  
  type ClassDictionary = Record[String, String]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait ComponentProps extends StObject {
    
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
  }
  object ComponentProps {
    
    inline def apply(): ComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  type GenericDictionary = Record[String, Any]
  
  type ShorthandProps[TProps /* <: ComponentProps */] = js.UndefOr[
    ReactChild | ReactNodeArray | ReactPortal | Boolean | Double | Null | (TProps & ComponentProps & Children[TProps])
  ]
  
  type ShorthandRenderFunction[TProps] = js.Function2[/* Component */ ElementType[TProps], /* props */ TProps, ReactNode]
}
