package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Array. For documentation of this class, see java.sql.Array
  * .
  */
@js.native
trait JdbcArray extends StObject {
  
  def free(): Unit = js.native
  
  def getArray(): js.Any = js.native
  def getArray(index: Integer, count: Integer): js.Any = js.native
  
  def getBaseType(): Integer = js.native
  
  def getBaseTypeName(): String = js.native
  
  def getResultSet(): JdbcResultSet = js.native
  def getResultSet(index: Integer, count: Integer): JdbcResultSet = js.native
}
