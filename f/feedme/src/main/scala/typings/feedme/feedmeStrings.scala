package typings.feedme

import typings.feedme.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object feedmeStrings {
  @js.native
  sealed trait atom extends Type
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait drain extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait finish extends js.Object
  
  @js.native
  sealed trait item extends js.Object
  
  @js.native
  sealed trait json extends Type
  
  @js.native
  sealed trait pipe extends js.Object
  
  @js.native
  sealed trait `rss 0Dot90` extends Type
  
  @js.native
  sealed trait `rss 0Dot91` extends Type
  
  @js.native
  sealed trait `rss 0Dot92` extends Type
  
  @js.native
  sealed trait `rss 0Dot93` extends Type
  
  @js.native
  sealed trait `rss 0Dot94` extends Type
  
  @js.native
  sealed trait `rss 1Dot0` extends Type
  
  @js.native
  sealed trait `rss 2Dot0` extends Type
  
  @js.native
  sealed trait `type` extends js.Object
  
  @js.native
  sealed trait unpipe extends js.Object
  
  @scala.inline
  def atom: atom = "atom".asInstanceOf[atom]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def drain: drain = "drain".asInstanceOf[drain]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  @scala.inline
  def item: item = "item".asInstanceOf[item]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def pipe: pipe = "pipe".asInstanceOf[pipe]
  @scala.inline
  def `rss 0Dot90`: `rss 0Dot90` = ("rss 0.90").asInstanceOf[`rss 0Dot90`]
  @scala.inline
  def `rss 0Dot91`: `rss 0Dot91` = ("rss 0.91").asInstanceOf[`rss 0Dot91`]
  @scala.inline
  def `rss 0Dot92`: `rss 0Dot92` = ("rss 0.92").asInstanceOf[`rss 0Dot92`]
  @scala.inline
  def `rss 0Dot93`: `rss 0Dot93` = ("rss 0.93").asInstanceOf[`rss 0Dot93`]
  @scala.inline
  def `rss 0Dot94`: `rss 0Dot94` = ("rss 0.94").asInstanceOf[`rss 0Dot94`]
  @scala.inline
  def `rss 1Dot0`: `rss 1Dot0` = ("rss 1.0").asInstanceOf[`rss 1Dot0`]
  @scala.inline
  def `rss 2Dot0`: `rss 2Dot0` = ("rss 2.0").asInstanceOf[`rss 2Dot0`]
  @scala.inline
  def `type`: `type` = "type".asInstanceOf[`type`]
  @scala.inline
  def unpipe: unpipe = "unpipe".asInstanceOf[unpipe]
}

