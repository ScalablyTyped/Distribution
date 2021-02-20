package typings.durandal

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The binder joins an object instance and a DOM element tree by applying databinding and/or invoking binding lifecycle callbacks (binding and bindingComplete).
  * @requires system
  * @requires knockout
  */
object binderMod {
  
  @JSImport("durandal/binder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("durandal/binder", "bind")
  @js.native
  def bind(obj: js.Any, view: HTMLElement): BindingInstruction = js.native
  
  @JSImport("durandal/binder", "bindContext")
  @js.native
  def bindContext(
    bindingContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ js.Any,
    view: HTMLElement
  ): BindingInstruction = js.native
  @JSImport("durandal/binder", "bindContext")
  @js.native
  def bindContext(
    bindingContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ js.Any,
    view: HTMLElement,
    obj: js.UndefOr[scala.Nothing],
    dataAlias: String
  ): BindingInstruction = js.native
  @JSImport("durandal/binder", "bindContext")
  @js.native
  def bindContext(
    bindingContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ js.Any,
    view: HTMLElement,
    obj: js.Any
  ): BindingInstruction = js.native
  @JSImport("durandal/binder", "bindContext")
  @js.native
  def bindContext(
    bindingContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ js.Any,
    view: HTMLElement,
    obj: js.Any,
    dataAlias: String
  ): BindingInstruction = js.native
  
  @JSImport("durandal/binder", "binding")
  @js.native
  def binding: js.Function3[/* data */ js.Any, /* view */ HTMLElement, /* instruction */ BindingInstruction, Unit] = js.native
  
  @JSImport("durandal/binder", "bindingComplete")
  @js.native
  def bindingComplete: js.Function3[/* data */ js.Any, /* view */ HTMLElement, /* instruction */ BindingInstruction, Unit] = js.native
  @scala.inline
  def bindingComplete_=(
    x: js.Function3[/* data */ js.Any, /* view */ HTMLElement, /* instruction */ BindingInstruction, Unit]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bindingComplete")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def binding_=(
    x: js.Function3[/* data */ js.Any, /* view */ HTMLElement, /* instruction */ BindingInstruction, Unit]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("binding")(x.asInstanceOf[js.Any])
  
  @JSImport("durandal/binder", "getBindingInstruction")
  @js.native
  def getBindingInstruction(view: HTMLElement): BindingInstruction = js.native
  
  @JSImport("durandal/binder", "throwOnErrors")
  @js.native
  def throwOnErrors: Boolean = js.native
  @scala.inline
  def throwOnErrors_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("throwOnErrors")(x.asInstanceOf[js.Any])
  
  @js.native
  trait BindingInstruction extends StObject {
    
    var applyBindings: Boolean = js.native
  }
  object BindingInstruction {
    
    @scala.inline
    def apply(applyBindings: Boolean): BindingInstruction = {
      val __obj = js.Dynamic.literal(applyBindings = applyBindings.asInstanceOf[js.Any])
      __obj.asInstanceOf[BindingInstruction]
    }
    
    @scala.inline
    implicit class BindingInstructionMutableBuilder[Self <: BindingInstruction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyBindings(value: Boolean): Self = StObject.set(x, "applyBindings", value.asInstanceOf[js.Any])
    }
  }
}
