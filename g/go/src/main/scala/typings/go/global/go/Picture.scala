package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Picture is a GraphObject that shows an image, video-frame, or Canvas element.
  * You can specify what to show by either setting the .source URL property
  * to a URL string or the .element property to an HTMLImageElement,
  * HTMLCanvasElement, or HTMLVideoElement.
  */
@JSGlobal("go.Picture")
@js.native
/**
  * The constructor creates a picture that shows nothing until the .source or .element is specified.
  */
open class Picture ()
  extends typings.go.mod.Picture
object Picture {
  
  @JSGlobal("go.Picture")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  inline def clearCache(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
