package typings.editly.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * How to fit image to screen. Can be one of:
	 * - `'contain'` - All the video will be contained within the frame and letterboxed.
	 * - `'contain-blur'` - Like contain, but with a blurred copy as the letterbox.
	 * - `'cover'` - Video be cropped to cover the whole screen (aspect ratio preserved).
	 * - `'stretch'` - Video will be stretched to cover the whole screen (aspect ratio ignored).
	 *
	 * @default 'contain-blur'
	 * @see [Example 'image.json5']{@link https://github.com/mifi/editly/blob/master/examples/image.json5}
	 * @see [Example 'videos.json5']{@link https://github.com/mifi/editly/blob/master/examples/videos.json5}
	 */
/* Rewritten from type alias, can be one of: 
  - typings.editly.editlyStrings.contain
  - typings.editly.editlyStrings.`contain-blur`
  - typings.editly.editlyStrings.cover
  - typings.editly.editlyStrings.stretch
*/
trait ResizeMode extends StObject
object ResizeMode {
  
  inline def contain: typings.editly.editlyStrings.contain = "contain".asInstanceOf[typings.editly.editlyStrings.contain]
  
  inline def `contain-blur`: typings.editly.editlyStrings.`contain-blur` = "contain-blur".asInstanceOf[typings.editly.editlyStrings.`contain-blur`]
  
  inline def cover: typings.editly.editlyStrings.cover = "cover".asInstanceOf[typings.editly.editlyStrings.cover]
  
  inline def stretch: typings.editly.editlyStrings.stretch = "stretch".asInstanceOf[typings.editly.editlyStrings.stretch]
}
