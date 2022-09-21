package typings.djangoBananas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("django-bananas", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("django-bananas", "default.App")
  @js.native
  def App: Instantiable0[typings.djangoBananas.mod.App] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("django-bananas", "default.App")
  @js.native
  open class AppCls () extends App
  
  inline def App_=(x: Instantiable0[App]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("App")(x.asInstanceOf[js.Any])
}
