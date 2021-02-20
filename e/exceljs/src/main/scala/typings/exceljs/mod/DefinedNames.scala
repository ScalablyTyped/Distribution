package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinedNames extends StObject {
  
  // add a name to a cell. locStr in the form SheetName!$col$row or SheetName!$c1$r1:$c2:$r2
  def add(locStr: String): Unit = js.native
  def add(locStr: String, name: String): Unit = js.native
  
  def addEx(location: String, name: String): Cell = js.native
  def addEx(location: Location, name: String): Cell = js.native
  
  def forEach(callback: js.Function2[/* name */ String, /* cell */ Cell, Unit]): Unit = js.native
  
  def getMatrix(name: String): CellMatrix = js.native
  
  // get all the names of a cell
  def getNames(addressStr: String): js.Array[String] = js.native
  
  def getNamesEx(address: String): js.Array[String] = js.native
  
  def getRanges(name: String): DefinedNamesRanges = js.native
  def getRanges(name: String, matrix: CellMatrix): DefinedNamesRanges = js.native
  
  var model: DefinedNamesModel = js.native
  
  def remove(locStr: String, name: String): Unit = js.native
  def remove(locStr: Location, name: String): Unit = js.native
  
  def removeAllNames(location: String): Unit = js.native
  def removeAllNames(location: Location): Unit = js.native
  
  def removeEx(location: String, name: String): Unit = js.native
  def removeEx(location: Location, name: String): Unit = js.native
}
