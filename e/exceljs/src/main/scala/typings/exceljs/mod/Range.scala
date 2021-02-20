package typings.exceljs.mod

import typings.exceljs.anon.PartialsheetNamestringrow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends Location {
  
  @JSName("$range")
  var $range: String = js.native
  
  @JSName("$shortRange")
  var $shortRange: String = js.native
  
  @JSName("$b$r")
  var DollarbDollarr: String = js.native
  
  @JSName("$t$l")
  var DollartDollarl: String = js.native
  
  var br: String = js.native
  
  def contains(addressStr: String): Boolean = js.native
  
  def containsEx(address: PartialsheetNamestringrow): Boolean = js.native
  
  var count: Double = js.native
  
  def decode(): Unit = js.native
  def decode(tl: String, br: String): Unit = js.native
  def decode(tl: String, br: String, sheetName: String): Unit = js.native
  def decode(top: Double, left: Double, bottom: Double, right: Double): Unit = js.native
  def decode(top: Double, left: Double, bottom: Double, right: Double, sheetName: String): Unit = js.native
  def decode(v: String): Unit = js.native
  def decode(v: js.Tuple2[String, String]): Unit = js.native
  def decode(v: js.Tuple3[String, String, String]): Unit = js.native
  def decode(v: js.Tuple4[Double, Double, Double, Double]): Unit = js.native
  def decode(v: js.Tuple5[Double, Double, Double, Double, String]): Unit = js.native
  def decode(v: Location): Unit = js.native
  def decode(v: Range): Unit = js.native
  
  def expand(top: Double, left: Double, bottom: Double, right: Double): Unit = js.native
  
  def expandRow(row: Row): Unit = js.native
  
  def expandToAddress(addressStr: String): Unit = js.native
  
  def intersects(other: Range): Boolean = js.native
  
  var range: String = js.native
  
  var sheetName: String = js.native
  
  var shortRange: String = js.native
  
  var tl: String = js.native
}
