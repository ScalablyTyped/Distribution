package typings.fullcalendarCore.internalCommonMod

import typings.fullcalendarCore.preactMod.Component
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentContainer[RenderProps]
  extends Component[
      ContentContainerProps[RenderProps], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ Any
    ] {
  
  var InnerContent: Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MContentContainer(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MContentContainer(): Unit = js.native
  
  @JSName("context")
  var context_ContentContainer: Double = js.native
  
  def handleRootEl(el: HTMLElement): Unit = js.native
  
  var rootEl: HTMLElement = js.native
}
