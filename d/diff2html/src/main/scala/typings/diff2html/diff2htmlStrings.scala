package typings.diff2html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object diff2htmlStrings {
  @js.native
  sealed trait diff extends js.Object
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait `line-by-line` extends js.Object
  
  @js.native
  sealed trait lines extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait `side-by-side` extends js.Object
  
  @js.native
  sealed trait words extends js.Object
  
  @scala.inline
  def diff: diff = "diff".asInstanceOf[diff]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def `line-by-line`: `line-by-line` = "line-by-line".asInstanceOf[`line-by-line`]
  @scala.inline
  def lines: lines = "lines".asInstanceOf[lines]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def `side-by-side`: `side-by-side` = "side-by-side".asInstanceOf[`side-by-side`]
  @scala.inline
  def words: words = "words".asInstanceOf[words]
}

