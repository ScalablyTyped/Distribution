package typings.flatpickr

import typings.flatpickr.instanceMod.FlatpickrFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("flatpickr/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("flatpickr/dist", JSImport.Default)
  @js.native
  def default: FlatpickrFn = js.native
  @scala.inline
  def default_=(x: FlatpickrFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
