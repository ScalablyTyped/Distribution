package typings.diff2html

import typings.diff2html.renderUtilsMod.CSSLineClass
import typings.diff2html.typesMod.DiffStyleType
import typings.diff2html.typesMod.LineMatchingType
import typings.diff2html.typesMod.OutputFormatType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diff2htmlStrings {
  
  @js.native
  sealed trait char
    extends StObject
       with DiffStyleType
  inline def char: char = "char".asInstanceOf[char]
  
  @js.native
  sealed trait `d2h-cntx`
    extends StObject
       with CSSLineClass
  inline def `d2h-cntx`: `d2h-cntx` = "d2h-cntx".asInstanceOf[`d2h-cntx`]
  
  @js.native
  sealed trait `d2h-del`
    extends StObject
       with CSSLineClass
  inline def `d2h-del`: `d2h-del` = "d2h-del".asInstanceOf[`d2h-del`]
  
  @js.native
  sealed trait `d2h-del d2h-change`
    extends StObject
       with CSSLineClass
  inline def `d2h-del d2h-change`: `d2h-del d2h-change` = ("d2h-del d2h-change").asInstanceOf[`d2h-del d2h-change`]
  
  @js.native
  sealed trait `d2h-info`
    extends StObject
       with CSSLineClass
  inline def `d2h-info`: `d2h-info` = "d2h-info".asInstanceOf[`d2h-info`]
  
  @js.native
  sealed trait `d2h-ins`
    extends StObject
       with CSSLineClass
  inline def `d2h-ins`: `d2h-ins` = "d2h-ins".asInstanceOf[`d2h-ins`]
  
  @js.native
  sealed trait `d2h-ins d2h-change`
    extends StObject
       with CSSLineClass
  inline def `d2h-ins d2h-change`: `d2h-ins d2h-change` = ("d2h-ins d2h-change").asInstanceOf[`d2h-ins d2h-change`]
  
  @js.native
  sealed trait `line-by-line`
    extends StObject
       with OutputFormatType
  inline def `line-by-line`: `line-by-line` = "line-by-line".asInstanceOf[`line-by-line`]
  
  @js.native
  sealed trait lines
    extends StObject
       with LineMatchingType
  inline def lines: lines = "lines".asInstanceOf[lines]
  
  @js.native
  sealed trait none
    extends StObject
       with LineMatchingType
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait `side-by-side`
    extends StObject
       with OutputFormatType
  inline def `side-by-side`: `side-by-side` = "side-by-side".asInstanceOf[`side-by-side`]
  
  @js.native
  sealed trait start extends StObject
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait stop extends StObject
  inline def stop: stop = "stop".asInstanceOf[stop]
  
  @js.native
  sealed trait word
    extends StObject
       with DiffStyleType
  inline def word: word = "word".asInstanceOf[word]
  
  @js.native
  sealed trait words
    extends StObject
       with LineMatchingType
  inline def words: words = "words".asInstanceOf[words]
}
