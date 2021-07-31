package typings.emojione

import typings.emojione.emojioneStrings.png
import typings.emojione.emojioneStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("emojione", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("emojione", "ascii")
  @js.native
  def ascii: Boolean = js.native
  @scala.inline
  def ascii_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ascii")(x.asInstanceOf[js.Any])
  
  @JSImport("emojione", "cacheBustParam")
  @js.native
  def cacheBustParam: String = js.native
  @scala.inline
  def cacheBustParam_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheBustParam")(x.asInstanceOf[js.Any])
  
  @JSImport("emojione", "imagePathPNG")
  @js.native
  def imagePathPNG: String = js.native
  @scala.inline
  def imagePathPNG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagePathPNG")(x.asInstanceOf[js.Any])
  
  @JSImport("emojione", "imagePathSVG")
  @js.native
  def imagePathSVG: String = js.native
  
  @JSImport("emojione", "imagePathSVGSprites")
  @js.native
  def imagePathSVGSprites: String = js.native
  @scala.inline
  def imagePathSVGSprites_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagePathSVGSprites")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def imagePathSVG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagePathSVG")(x.asInstanceOf[js.Any])
  
  @JSImport("emojione", "imageType")
  @js.native
  def imageType: png | svg = js.native
  @scala.inline
  def imageType_=(x: png | svg): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imageType")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def shortnameToImage(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shortnameToImage")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def shortnameToUnicode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shortnameToUnicode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("emojione", "sprites")
  @js.native
  def sprites: Boolean = js.native
  @scala.inline
  def sprites_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sprites")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def toImage(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toShort(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toShort")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("emojione", "unicodeAlt")
  @js.native
  def unicodeAlt: Boolean = js.native
  @scala.inline
  def unicodeAlt_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unicodeAlt")(x.asInstanceOf[js.Any])
  
  @JSImport("emojione", "unicodeRegexp")
  @js.native
  def unicodeRegexp: String = js.native
  @scala.inline
  def unicodeRegexp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unicodeRegexp")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def unicodeToImage(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unicodeToImage")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
