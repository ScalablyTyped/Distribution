package typings.diff2html

import typings.diff2html.renderUtilsMod.CSSLineClass
import typings.diff2html.typesMod.DiffStyleType
import typings.diff2html.typesMod.LineMatchingType
import typings.diff2html.typesMod.OutputFormatType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diff2htmlStrings {
  
  @scala.inline
  def char: char = "char".asInstanceOf[char]
  
  @scala.inline
  def `d2h-cntx`: `d2h-cntx` = "d2h-cntx".asInstanceOf[`d2h-cntx`]
  
  @scala.inline
  def `d2h-del`: `d2h-del` = "d2h-del".asInstanceOf[`d2h-del`]
  
  @scala.inline
  def `d2h-del d2h-change`: `d2h-del d2h-change` = ("d2h-del d2h-change").asInstanceOf[`d2h-del d2h-change`]
  
  @scala.inline
  def `d2h-info`: `d2h-info` = "d2h-info".asInstanceOf[`d2h-info`]
  
  @scala.inline
  def `d2h-ins`: `d2h-ins` = "d2h-ins".asInstanceOf[`d2h-ins`]
  
  @scala.inline
  def `d2h-ins d2h-change`: `d2h-ins d2h-change` = ("d2h-ins d2h-change").asInstanceOf[`d2h-ins d2h-change`]
  
  @scala.inline
  def `line-by-line`: `line-by-line` = "line-by-line".asInstanceOf[`line-by-line`]
  
  @scala.inline
  def lines: lines = "lines".asInstanceOf[lines]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def `side-by-side`: `side-by-side` = "side-by-side".asInstanceOf[`side-by-side`]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  
  @scala.inline
  def word: word = "word".asInstanceOf[word]
  
  @scala.inline
  def words: words = "words".asInstanceOf[words]
  
  @js.native
  sealed trait char extends DiffStyleType
  
  @js.native
  sealed trait `d2h-cntx` extends CSSLineClass
  
  @js.native
  sealed trait `d2h-del` extends CSSLineClass
  
  @js.native
  sealed trait `d2h-del d2h-change` extends CSSLineClass
  
  @js.native
  sealed trait `d2h-info` extends CSSLineClass
  
  @js.native
  sealed trait `d2h-ins` extends CSSLineClass
  
  @js.native
  sealed trait `d2h-ins d2h-change` extends CSSLineClass
  
  @js.native
  sealed trait `line-by-line` extends OutputFormatType
  
  @js.native
  sealed trait lines extends LineMatchingType
  
  @js.native
  sealed trait none extends LineMatchingType
  
  @js.native
  sealed trait `side-by-side` extends OutputFormatType
  
  @js.native
  sealed trait start extends js.Object
  
  @js.native
  sealed trait stop extends js.Object
  
  @js.native
  sealed trait word extends DiffStyleType
  
  @js.native
  sealed trait words extends LineMatchingType
}
