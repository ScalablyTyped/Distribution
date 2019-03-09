package typings
package dvLib.dvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dv", "Tesseract")
@js.native
/**
	 * Creates a Tesseract engine with language set to english.
	 */
class Tesseract ()
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def this(datapath: java.lang.String) = this()
  /**
  	 * Creates a Tesseract engine with the specified language.
  	 */
  def this(lang: java.lang.String, image: Image) = this()
  /**
  	 * Creates a Tesseract engine with the specified language and image.
  	 */
  def this(datapath: java.lang.String, lang: java.lang.String, image: Image) = this()
  /**
  	 * Accessor for the input image.
  	 */
  var image: Image = js.native
  /**
  	 * Accessor for the page segmentation mode.
  	 */
  var pageSegMode: dvLib.dvLibStrings.osd_only | dvLib.dvLibStrings.auto_osd | dvLib.dvLibStrings.auto_only | dvLib.dvLibStrings.auto | dvLib.dvLibStrings.single_column | dvLib.dvLibStrings.single_block_vert_text | dvLib.dvLibStrings.single_block | dvLib.dvLibStrings.single_line | dvLib.dvLibStrings.single_word | dvLib.dvLibStrings.circle_word | dvLib.dvLibStrings.single_char | dvLib.dvLibStrings.sparse_text | dvLib.dvLibStrings.sparse_text_osd = js.native
  /**
  	 * Accessor for the rectangle that specifies a "visible" area on the image.
  	 */
  var rectangle: Rect = js.native
  /**
  	 * Clears the tesseract image and its last results.
  	 */
  def clear(): scala.Unit = js.native
  /**
  	 * Clears all adaptive classifiers (use this when results vary during scanning).
  	 */
  def clearAdaptiveClassifier(): scala.Unit = js.native
  /**
  	 * Returns an array of objects, You can omit text information by setting recognize = false, which is considerably faster.
  	 */
  def findParagraphs(recognize: scala.Boolean): js.Array[Paragaph] = js.native
  /**
  	 * Returns an array of objects, You can omit text information by setting recognize = false, which is considerably faster.
  	 */
  def findRegions(recognize: scala.Boolean): js.Array[Region] = js.native
  /**
  	 * Returns an array of objects, You can omit text information by setting recognize = false, which is considerably faster.
  	 */
  def findSymbols(recognize: scala.Boolean): js.Array[js.Symbol] = js.native
  /**
  	 * Returns an array of objects, You can omit text information by setting recognize = false, which is considerably faster.
  	 */
  def findTextLines(recognize: scala.Boolean): js.Array[Textline] = js.native
  @JSName("findText")
  def findText_box(format: dvLib.dvLibStrings.box, pageNumber: scala.Double): java.lang.String = js.native
  @JSName("findText")
  def findText_hocr(format: dvLib.dvLibStrings.hocr, pageNumber: scala.Double): java.lang.String = js.native
  /**
  	 * Returns text in the specified format. Valid formats are: plain, unlv.
  	 */
  @JSName("findText")
  def findText_plain(format: dvLib.dvLibStrings.plain): java.lang.String = js.native
  @JSName("findText")
  def findText_plain(format: dvLib.dvLibStrings.plain, withConfidence: scala.Boolean): java.lang.String = js.native
  @JSName("findText")
  def findText_unlv(format: dvLib.dvLibStrings.unlv): java.lang.String = js.native
  @JSName("findText")
  def findText_unlv(format: dvLib.dvLibStrings.unlv, withConfidence: scala.Boolean): java.lang.String = js.native
  /**
  	 * Returns an array of objects, You can omit text information by setting recognize = false, which is considerably faster.
  	 */
  def findWords(recognize: scala.Boolean): js.Array[Word] = js.native
  /**
  	 * Returns the binarized image Tesseract uses for its recognition.
  	 */
  def thresholdImage(): Image = js.native
}

