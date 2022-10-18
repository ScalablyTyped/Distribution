package typings.egjsComponent

import org.scalablytyped.runtime.Shortcut
import typings.egjsComponent.declarationTypesMod.ComponentEventConstructor
import typings.egjsComponent.declarationTypesMod.DefaultProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationComponentEventMod extends Shortcut {
  
  @JSImport("@egjs/component/declaration/ComponentEvent", JSImport.Default)
  @js.native
  val default: ComponentEventConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@egjs/component/declaration/ComponentEvent", JSImport.Default)
  @js.native
  open class defaultCls[TYPE /* <: String */, THIS] protected ()
    extends StObject
       with DefaultProps[TYPE, THIS] {
    def this(eventType: TYPE) = this()
    
    /* CompleteClass */
    var currentTarget: THIS = js.native
    
    /* CompleteClass */
    var eventType: TYPE = js.native
    
    /* CompleteClass */
    override def isCanceled(): Boolean = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  type ComponentEvent[PROPS, TYPE /* <: String */, THIS] = (DefaultProps[TYPE, THIS]) & PROPS
  
  type _To = ComponentEventConstructor
  
  /* This means you don't have to write `default`, but can instead just say `declarationComponentEventMod.foo` */
  override def _to: ComponentEventConstructor = default
}
