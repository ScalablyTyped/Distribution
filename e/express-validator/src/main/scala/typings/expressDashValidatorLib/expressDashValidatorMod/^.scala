package typings
package expressDashValidatorLib.expressDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val validationResult: expressDashValidatorLib.srcValidationDashResultMod.ResultFactory[expressDashValidatorLib.srcBaseMod.ValidationError] with expressDashValidatorLib.Anon_WithDefaults = js.native
  def body(): js.Any = js.native
  def body(fields: js.UndefOr[scala.Nothing], message: js.Any): js.Any = js.native
  def body(fields: java.lang.String): js.Any = js.native
  def body(fields: java.lang.String, message: js.Any): js.Any = js.native
  def body(fields: js.Array[java.lang.String]): js.Any = js.native
  def body(fields: js.Array[java.lang.String], message: js.Any): js.Any = js.native
  def buildCheckFunction(locations: js.Array[expressDashValidatorLib.srcBaseMod.Location]): js.Function2[
    /* fields */ js.UndefOr[java.lang.String | js.Array[java.lang.String]], 
    /* message */ js.UndefOr[js.Any], 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_express-validator/src.ValidationChain */ _
  ] = js.native
  def buildSanitizeFunction(locations: js.Array[expressDashValidatorLib.srcBaseMod.Location]): js.Function1[
    /* fields */ js.UndefOr[java.lang.String | js.Array[java.lang.String]], 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_express-validator/src.SanitizationChain */ _
  ] = js.native
  def check(): js.Any = js.native
  def check(fields: js.UndefOr[scala.Nothing], message: js.Any): js.Any = js.native
  def check(fields: java.lang.String): js.Any = js.native
  def check(fields: java.lang.String, message: js.Any): js.Any = js.native
  def check(fields: js.Array[java.lang.String]): js.Any = js.native
  def check(fields: js.Array[java.lang.String], message: js.Any): js.Any = js.native
  def checkSchema(schema: expressDashValidatorLib.srcMiddlewaresSchemaMod.Schema): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_express-validator/src/chain.ValidationChain */ _
  ] = js.native
  def checkSchema(
    schema: expressDashValidatorLib.srcMiddlewaresSchemaMod.Schema,
    defaultLocations: js.Array[expressDashValidatorLib.srcBaseMod.Location]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_express-validator/src/chain.ValidationChain */ _
  ] = js.native
  def cookie(): js.Any = js.native
  def cookie(fields: js.UndefOr[scala.Nothing], message: js.Any): js.Any = js.native
  def cookie(fields: java.lang.String): js.Any = js.native
  def cookie(fields: java.lang.String, message: js.Any): js.Any = js.native
  def cookie(fields: js.Array[java.lang.String]): js.Any = js.native
  def cookie(fields: js.Array[java.lang.String], message: js.Any): js.Any = js.native
  def header(): js.Any = js.native
  def header(fields: js.UndefOr[scala.Nothing], message: js.Any): js.Any = js.native
  def header(fields: java.lang.String): js.Any = js.native
  def header(fields: java.lang.String, message: js.Any): js.Any = js.native
  def header(fields: js.Array[java.lang.String]): js.Any = js.native
  def header(fields: js.Array[java.lang.String], message: js.Any): js.Any = js.native
  def matchedData(req: expressDashValidatorLib.srcBaseMod.Request): stdLib.Record[java.lang.String, _] = js.native
  def matchedData(
    req: expressDashValidatorLib.srcBaseMod.Request,
    options: stdLib.Partial[expressDashValidatorLib.srcMatchedDashDataMod.MatchedDataOptions]
  ): stdLib.Record[java.lang.String, _] = js.native
  def oneOf(
    chains: js.Array[
      js.Array[expressDashValidatorLib.srcChainValidationDashChainMod.ValidationChain] | expressDashValidatorLib.srcChainValidationDashChainMod.ValidationChain
    ]
  ): expressDashValidatorLib.srcBaseMod.Middleware = js.native
  def oneOf(
    chains: js.Array[
      expressDashValidatorLib.srcChainValidationDashChainMod.ValidationChain | js.Array[expressDashValidatorLib.srcChainValidationDashChainMod.ValidationChain]
    ],
    message: expressDashValidatorLib.srcMiddlewaresOneDashOfMod.OneOfCustomMessageBuilder
  ): expressDashValidatorLib.srcBaseMod.Middleware = js.native
  def oneOf(
    chains: js.Array[
      expressDashValidatorLib.srcChainValidationDashChainMod.ValidationChain | js.Array[expressDashValidatorLib.srcChainValidationDashChainMod.ValidationChain]
    ],
    message: js.Any
  ): expressDashValidatorLib.srcBaseMod.Middleware = js.native
  def param(): js.Any = js.native
  def param(fields: js.UndefOr[scala.Nothing], message: js.Any): js.Any = js.native
  def param(fields: java.lang.String): js.Any = js.native
  def param(fields: java.lang.String, message: js.Any): js.Any = js.native
  def param(fields: js.Array[java.lang.String]): js.Any = js.native
  def param(fields: js.Array[java.lang.String], message: js.Any): js.Any = js.native
  def query(): js.Any = js.native
  def query(fields: js.UndefOr[scala.Nothing], message: js.Any): js.Any = js.native
  def query(fields: java.lang.String): js.Any = js.native
  def query(fields: java.lang.String, message: js.Any): js.Any = js.native
  def query(fields: js.Array[java.lang.String]): js.Any = js.native
  def query(fields: js.Array[java.lang.String], message: js.Any): js.Any = js.native
  def sanitize(): js.Any = js.native
  def sanitize(fields: java.lang.String): js.Any = js.native
  def sanitize(fields: js.Array[java.lang.String]): js.Any = js.native
  def sanitizeBody(): js.Any = js.native
  def sanitizeBody(fields: java.lang.String): js.Any = js.native
  def sanitizeBody(fields: js.Array[java.lang.String]): js.Any = js.native
  def sanitizeCookie(): js.Any = js.native
  def sanitizeCookie(fields: java.lang.String): js.Any = js.native
  def sanitizeCookie(fields: js.Array[java.lang.String]): js.Any = js.native
  def sanitizeParam(): js.Any = js.native
  def sanitizeParam(fields: java.lang.String): js.Any = js.native
  def sanitizeParam(fields: js.Array[java.lang.String]): js.Any = js.native
  def sanitizeQuery(): js.Any = js.native
  def sanitizeQuery(fields: java.lang.String): js.Any = js.native
  def sanitizeQuery(fields: js.Array[java.lang.String]): js.Any = js.native
}

