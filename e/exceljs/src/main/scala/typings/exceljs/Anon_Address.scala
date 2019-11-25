package typings.exceljs

import typings.exceljs.exceljsMod.Address
import typings.exceljs.exceljsMod.Column
import typings.exceljs.exceljsMod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: Address
  var col: Column
  var row: Row
  var sheetName: String
}

object Anon_Address {
  @scala.inline
  def apply(address: Address, col: Column, row: Row, sheetName: String): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Address]
  }
}

