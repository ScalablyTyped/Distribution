package typings.expoFont.fontTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontDisplay extends js.Object

@JSImport("expo-font/build/Font.types", "FontDisplay")
@js.native
object FontDisplay extends js.Object {
  /**
    * (Default on web) The font display strategy is defined by the user agent or platform.
    * This generally defaults to the text being invisible until the font is loaded.
    * Good for buttons or banners that require a specific treatment.
    */
  @js.native
  sealed trait AUTO extends FontDisplay
  
  /**
    * The text will be invisible until the font has loaded.
    * If the font fails to load, nothing will appear.
    */
  @js.native
  sealed trait BLOCK extends FontDisplay
  
  /**
    * Splits the behavior between `SWAP` and `BLOCK`.
    * There will be a [100ms timeout](https://developers.google.com/web/updates/2016/02/font-display?hl=en) where the text with a custom font is invisible,
    * after that the text will either swap to the styled text or it'll show the unstyled text and continue to load the custom font.
    * This is good for buttons that need a custom font but should also be quickly available to screen-readers.
    */
  @js.native
  sealed trait FALLBACK extends FontDisplay
  
  /**
    * This works almost identically to `FALLBACK`,
    * the only difference is that the browser will decide to load the font based on slow connection speed or critical resource demand.
    */
  @js.native
  sealed trait OPTIONAL extends FontDisplay
  
  /**
    * Fallback text is rendered immediately with a default font while the desired font is loaded.
    * This is good for making the content appear to load instantly and is usally preferred.
    */
  @js.native
  sealed trait SWAP extends FontDisplay
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FontDisplay with String] = js.native
  /* "auto" */ @js.native
  object AUTO extends TopLevel[AUTO with String]
  
  /* "block" */ @js.native
  object BLOCK extends TopLevel[BLOCK with String]
  
  /* "fallback" */ @js.native
  object FALLBACK extends TopLevel[FALLBACK with String]
  
  /* "optional" */ @js.native
  object OPTIONAL extends TopLevel[OPTIONAL with String]
  
  /* "swap" */ @js.native
  object SWAP extends TopLevel[SWAP with String]
  
}

