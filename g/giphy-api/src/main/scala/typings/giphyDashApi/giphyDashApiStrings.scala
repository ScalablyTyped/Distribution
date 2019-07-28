package typings.giphyDashApi

import typings.giphyDashApi.giphyDashApiMod.Format
import typings.giphyDashApi.giphyDashApiMod.Rating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object giphyDashApiStrings {
  @js.native
  sealed trait g extends Rating
  
  @js.native
  sealed trait html extends Format
  
  @js.native
  sealed trait json extends Format
  
  @js.native
  sealed trait pg extends Rating
  
  @js.native
  sealed trait `pg-13` extends Rating
  
  @js.native
  sealed trait r extends Rating
  
  @js.native
  sealed trait y extends Rating
  
  @scala.inline
  def g: g = "g".asInstanceOf[g]
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def pg: pg = "pg".asInstanceOf[pg]
  @scala.inline
  def `pg-13`: `pg-13` = "pg-13".asInstanceOf[`pg-13`]
  @scala.inline
  def r: r = "r".asInstanceOf[r]
  @scala.inline
  def y: y = "y".asInstanceOf[y]
}

