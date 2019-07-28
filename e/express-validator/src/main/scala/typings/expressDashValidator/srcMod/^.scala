package typings.expressDashValidator.srcMod

import typings.expressDashValidator.Anon_WithDefaults
import typings.expressDashValidator.srcBaseMod.Location
import typings.expressDashValidator.srcBaseMod.Middleware
import typings.expressDashValidator.srcBaseMod.Request
import typings.expressDashValidator.srcBaseMod.ValidationError
import typings.expressDashValidator.srcChainValidationDashChainMod.ValidationChain
import typings.expressDashValidator.srcMatchedDashDataMod.MatchedDataOptions
import typings.expressDashValidator.srcMiddlewaresOneDashOfMod.OneOfCustomMessageBuilder
import typings.expressDashValidator.srcMiddlewaresSchemaMod.Schema
import typings.expressDashValidator.srcValidationDashResultMod.ResultFactory
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val validationResult: ResultFactory[ValidationError] with Anon_WithDefaults = js.native
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
  def buildSanitizeFunction(locations: js.Array[Location]): js.Function1[
    /* fields */ js.UndefOr[String | js.Array[String]], 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_express-validator/src.SanitizationChain */ _
  ] = js.native
  def check(): js.Any = js.native
  def check(fields: js.UndefOr[scala.Nothing], message: js.Any): js.Any = js.native
  def check(fields: String): js.Any = js.native
  def check(fields: String, message: js.Any): js.Any = js.native
  def check(fields: js.Array[String]): js.Any = js.native
  def check(fields: js.Array[String], message: js.Any): js.Any = js.native
  def checkSchema(schema: Schema): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_express-validator/src/chain.ValidationChain */ _
  ] = js.native
  def checkSchema(schema: Schema, defaultLocations: js.Array[Location]): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_express-validator/src/chain.ValidationChain */ _
  ] = js.native
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
  def matchedData(req: Request): Record[String, _] = js.native
  def matchedData(req: Request, options: Partial[MatchedDataOptions]): Record[String, _] = js.native
  def oneOf(chains: js.Array[js.Array[ValidationChain] | ValidationChain]): Middleware = js.native
  def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: js.Any): Middleware = js.native
  def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: OneOfCustomMessageBuilder): Middleware = js.native
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
  def sanitize(): js.Any = js.native
  def sanitize(fields: String): js.Any = js.native
  def sanitize(fields: js.Array[String]): js.Any = js.native
  def sanitizeBody(): js.Any = js.native
  def sanitizeBody(fields: String): js.Any = js.native
  def sanitizeBody(fields: js.Array[String]): js.Any = js.native
  def sanitizeCookie(): js.Any = js.native
  def sanitizeCookie(fields: String): js.Any = js.native
  def sanitizeCookie(fields: js.Array[String]): js.Any = js.native
  def sanitizeParam(): js.Any = js.native
  def sanitizeParam(fields: String): js.Any = js.native
  def sanitizeParam(fields: js.Array[String]): js.Any = js.native
  def sanitizeQuery(): js.Any = js.native
  def sanitizeQuery(fields: String): js.Any = js.native
  def sanitizeQuery(fields: js.Array[String]): js.Any = js.native
}

