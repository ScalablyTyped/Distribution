package typings.faker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lines extends js.Object {
  
  def lines(): String = js.native
  def lines(lineCount: Double): String = js.native
  
  def paragraph(): String = js.native
  def paragraph(sentenceCount: Double): String = js.native
  
  def paragraphs(): String = js.native
  def paragraphs(paragraphCount: js.UndefOr[scala.Nothing], separator: String): String = js.native
  def paragraphs(paragraphCount: Double): String = js.native
  def paragraphs(paragraphCount: Double, separator: String): String = js.native
  
  def sentence(): String = js.native
  def sentence(wordCount: js.UndefOr[scala.Nothing], range: Double): String = js.native
  def sentence(wordCount: Double): String = js.native
  def sentence(wordCount: Double, range: Double): String = js.native
  
  def sentences(): String = js.native
  def sentences(sentenceCount: Double): String = js.native
  
  def slug(): String = js.native
  def slug(wordCount: Double): String = js.native
  
  def text(): String = js.native
  def text(times: Double): String = js.native
  
  def word(): String = js.native
  def word(length: Double): String = js.native
  
  def words(): String = js.native
  def words(num: Double): String = js.native
}
