package typings.expressDashValidator

import typings.expressDashValidator.srcBaseMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/middlewares/validation-chain-builders", JSImport.Namespace)
@js.native
object srcMiddlewaresValidationDashChainDashBuildersMod extends js.Object {
  def body(): js.Any = js.native
  def body(fields: js.UndefOr[scala.Nothing], message: js.Any): js.Any = js.native
  def body(fields: String): js.Any = js.native
  def body(fields: String, message: js.Any): js.Any = js.native
  def body(fields: js.Array[String]): js.Any = js.native
  def body(fields: js.Array[String], message: js.Any): js.Any = js.native
  def buildCheckFunction(locations: js.Array[Location]): js.Function2[
    /* fields */ js.UndefOr[String | js.Array[String]], 
    /* message */ js.UndefOr[js.Any], 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_express-validator/src.ValidationChain */ _
  ] = js.native
  def check(): js.Any = js.native
  def check(fields: js.UndefOr[scala.Nothing], message: js.Any): js.Any = js.native
  def check(fields: String): js.Any = js.native
  def check(fields: String, message: js.Any): js.Any = js.native
  def check(fields: js.Array[String]): js.Any = js.native
  def check(fields: js.Array[String], message: js.Any): js.Any = js.native
  def cookie(): js.Any = js.native
  def cookie(fields: js.UndefOr[scala.Nothing], message: js.Any): js.Any = js.native
  def cookie(fields: String): js.Any = js.native
  def cookie(fields: String, message: js.Any): js.Any = js.native
  def cookie(fields: js.Array[String]): js.Any = js.native
  def cookie(fields: js.Array[String], message: js.Any): js.Any = js.native
  def header(): js.Any = js.native
  def header(fields: js.UndefOr[scala.Nothing], message: js.Any): js.Any = js.native
  def header(fields: String): js.Any = js.native
  def header(fields: String, message: js.Any): js.Any = js.native
  def header(fields: js.Array[String]): js.Any = js.native
  def header(fields: js.Array[String], message: js.Any): js.Any = js.native
  def param(): js.Any = js.native
  def param(fields: js.UndefOr[scala.Nothing], message: js.Any): js.Any = js.native
  def param(fields: String): js.Any = js.native
  def param(fields: String, message: js.Any): js.Any = js.native
  def param(fields: js.Array[String]): js.Any = js.native
  def param(fields: js.Array[String], message: js.Any): js.Any = js.native
  def query(): js.Any = js.native
  def query(fields: js.UndefOr[scala.Nothing], message: js.Any): js.Any = js.native
  def query(fields: String): js.Any = js.native
  def query(fields: String, message: js.Any): js.Any = js.native
  def query(fields: js.Array[String]): js.Any = js.native
  def query(fields: js.Array[String], message: js.Any): js.Any = js.native
}

