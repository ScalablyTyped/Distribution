package typings.encodingJapanese.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.encodingJapanese.encodingJapaneseStrings.UTF32
  - typings.encodingJapanese.encodingJapaneseStrings.UTF16
  - typings.encodingJapanese.encodingJapaneseStrings.UTF16BE
  - typings.encodingJapanese.encodingJapaneseStrings.UTF16LE
  - typings.encodingJapanese.encodingJapaneseStrings.BINARY
  - typings.encodingJapanese.encodingJapaneseStrings.ASCII
  - typings.encodingJapanese.encodingJapaneseStrings.JIS
  - typings.encodingJapanese.encodingJapaneseStrings.UTF8
  - typings.encodingJapanese.encodingJapaneseStrings.EUCJP
  - typings.encodingJapanese.encodingJapaneseStrings.SJIS
  - typings.encodingJapanese.encodingJapaneseStrings.UNICODE
  - typings.encodingJapanese.encodingJapaneseStrings.AUTO
*/
trait Encoding extends js.Object

object Encoding {
  @scala.inline
  def ASCII: typings.encodingJapanese.encodingJapaneseStrings.ASCII = this.cast("ASCII")
  @scala.inline
  def AUTO: typings.encodingJapanese.encodingJapaneseStrings.AUTO = this.cast("AUTO")
  @scala.inline
  def BINARY: typings.encodingJapanese.encodingJapaneseStrings.BINARY = this.cast("BINARY")
  @scala.inline
  def EUCJP: typings.encodingJapanese.encodingJapaneseStrings.EUCJP = this.cast("EUCJP")
  @scala.inline
  def JIS: typings.encodingJapanese.encodingJapaneseStrings.JIS = this.cast("JIS")
  @scala.inline
  def SJIS: typings.encodingJapanese.encodingJapaneseStrings.SJIS = this.cast("SJIS")
  @scala.inline
  def UNICODE: typings.encodingJapanese.encodingJapaneseStrings.UNICODE = this.cast("UNICODE")
  @scala.inline
  def UTF16: typings.encodingJapanese.encodingJapaneseStrings.UTF16 = this.cast("UTF16")
  @scala.inline
  def UTF16BE: typings.encodingJapanese.encodingJapaneseStrings.UTF16BE = this.cast("UTF16BE")
  @scala.inline
  def UTF16LE: typings.encodingJapanese.encodingJapaneseStrings.UTF16LE = this.cast("UTF16LE")
  @scala.inline
  def UTF32: typings.encodingJapanese.encodingJapaneseStrings.UTF32 = this.cast("UTF32")
  @scala.inline
  def UTF8: typings.encodingJapanese.encodingJapaneseStrings.UTF8 = this.cast("UTF8")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

