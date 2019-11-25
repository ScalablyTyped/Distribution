package typings.fusioncharts.fusionchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fusioncharts.fusionchartsStrings.json
  - typings.fusioncharts.fusionchartsStrings.jsonurl
  - typings.fusioncharts.fusionchartsStrings.csv
  - typings.fusioncharts.fusionchartsStrings.xml
  - typings.fusioncharts.fusionchartsStrings.xmlurl
*/
trait ChartDataFormats extends js.Object

object ChartDataFormats {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def csv: typings.fusioncharts.fusionchartsStrings.csv = this.cast("csv")
  @scala.inline
  def json: typings.fusioncharts.fusionchartsStrings.json = this.cast("json")
  @scala.inline
  def jsonurl: typings.fusioncharts.fusionchartsStrings.jsonurl = this.cast("jsonurl")
  @scala.inline
  def xml: typings.fusioncharts.fusionchartsStrings.xml = this.cast("xml")
  @scala.inline
  def xmlurl: typings.fusioncharts.fusionchartsStrings.xmlurl = this.cast("xmlurl")
}

