package typings.flexmonster.anon

import typings.flexmonster.mod.GetDataErrorObject
import typings.flexmonster.mod.GetDataValueObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAxisFormat extends StObject {
  
  def getAxisFormat(format: js.Object): String = js.native
  
  def getData(options: ValuesOnly, callbackHandler: String): Unit = js.native
  def getData(options: ValuesOnly, callbackHandler: String, updateHandler: String): Unit = js.native
  def getData(
    options: ValuesOnly,
    callbackHandler: String,
    updateHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getData(
    options: ValuesOnly,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getData(
    options: ValuesOnly,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit],
    updateHandler: String
  ): Unit = js.native
  def getData(
    options: ValuesOnly,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit],
    updateHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  
  def getPointXFormat(format: js.Object): String = js.native
  
  def getPointYFormat(format: js.Object): String = js.native
  
  def getPointZFormat(format: js.Object): String = js.native
}
