package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBrowserSupportCoreMod {
  
  @JSImport("fbjs/lib/BrowserSupportCore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * True if browser supports css 3d transforms.
    */
  inline def hasCSS3DTransforms(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCSS3DTransforms")().asInstanceOf[Boolean]
  
  /**
    * True if browser supports css animations.
    */
  inline def hasCSSAnimations(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCSSAnimations")().asInstanceOf[Boolean]
  
  /**
    * True if browser supports css transforms.
    */
  inline def hasCSSTransforms(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCSSTransforms")().asInstanceOf[Boolean]
  
  /**
    * True if browser supports css transitions.
    */
  inline def hasCSSTransitions(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCSSTransitions")().asInstanceOf[Boolean]
}
