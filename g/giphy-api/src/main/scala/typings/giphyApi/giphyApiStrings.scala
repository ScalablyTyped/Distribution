package typings.giphyApi

import typings.giphyApi.mod.Format
import typings.giphyApi.mod.Rating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object giphyApiStrings {
  
  @js.native
  sealed trait g
    extends StObject
       with Rating
  @scala.inline
  def g: g = "g".asInstanceOf[g]
  
  @js.native
  sealed trait html
    extends StObject
       with Format
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait json
    extends StObject
       with Format
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait pg
    extends StObject
       with Rating
  @scala.inline
  def pg: pg = "pg".asInstanceOf[pg]
  
  @js.native
  sealed trait `pg-13`
    extends StObject
       with Rating
  @scala.inline
  def `pg-13`: `pg-13` = "pg-13".asInstanceOf[`pg-13`]
  
  @js.native
  sealed trait r
    extends StObject
       with Rating
  @scala.inline
  def r: r = "r".asInstanceOf[r]
  
  @js.native
  sealed trait y
    extends StObject
       with Rating
  @scala.inline
  def y: y = "y".asInstanceOf[y]
}
