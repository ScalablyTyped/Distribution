package typings
package expressDashValidatorLib.expressDashValidatorMod.ExpressValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestValidation extends js.Object {
  @JSName("assert")
  var assert_Original: ValidatorFunction = js.native
  @JSName("checkBody")
  var checkBody_Original: ValidatorFunction = js.native
  @JSName("checkCookies")
  var checkCookies_Original: ValidatorFunction = js.native
  @JSName("checkHeaders")
  var checkHeaders_Original: ValidatorFunction = js.native
  @JSName("checkParams")
  var checkParams_Original: ValidatorFunction = js.native
  @JSName("checkQuery")
  var checkQuery_Original: ValidatorFunction = js.native
  @JSName("check")
  var check_Original: ValidatorFunction = js.native
  @JSName("filter")
  var filter_Original: SanitizerFunction = js.native
  @JSName("sanitizeBody")
  var sanitizeBody_Original: SanitizerFunction = js.native
  @JSName("sanitizeCookies")
  var sanitizeCookies_Original: SanitizerFunction = js.native
  @JSName("sanitizeHeaders")
  var sanitizeHeaders_Original: SanitizerFunction = js.native
  @JSName("sanitizeParams")
  var sanitizeParams_Original: SanitizerFunction = js.native
  @JSName("sanitizeQuery")
  var sanitizeQuery_Original: SanitizerFunction = js.native
  @JSName("sanitize")
  var sanitize_Original: SanitizerFunction = js.native
  @JSName("validate")
  var validate_Original: ValidatorFunction = js.native
  def assert(item: java.lang.String): Validator = js.native
  def assert(item: java.lang.String, message: js.Any): Validator = js.native
  def assert(item: js.Array[java.lang.String]): Validator = js.native
  def assert(item: js.Array[java.lang.String], message: js.Any): Validator = js.native
  def assert(item: scala.Double): Validator = js.native
  def assert(item: scala.Double, message: js.Any): Validator = js.native
  def assert(schema: js.Object): Validator = js.native
  def asyncValidationErrors(): js.Promise[js.Array[_] | (stdLib.Record[java.lang.String, _])] = js.native
  def asyncValidationErrors(mapped: scala.Boolean): js.Promise[js.Array[_] | (stdLib.Record[java.lang.String, _])] = js.native
  @JSName("asyncValidationErrors")
  def asyncValidationErrors_T[T](): js.Promise[js.Array[T] | (stdLib.Record[java.lang.String, T])] = js.native
  @JSName("asyncValidationErrors")
  def asyncValidationErrors_T[T](mapped: scala.Boolean): js.Promise[js.Array[T] | (stdLib.Record[java.lang.String, T])] = js.native
  def check(item: java.lang.String): Validator = js.native
  def check(item: java.lang.String, message: js.Any): Validator = js.native
  def check(item: js.Array[java.lang.String]): Validator = js.native
  def check(item: js.Array[java.lang.String], message: js.Any): Validator = js.native
  def check(item: scala.Double): Validator = js.native
  def check(item: scala.Double, message: js.Any): Validator = js.native
  def check(schema: js.Object): Validator = js.native
  def checkBody(item: java.lang.String): Validator = js.native
  def checkBody(item: java.lang.String, message: js.Any): Validator = js.native
  def checkBody(item: js.Array[java.lang.String]): Validator = js.native
  def checkBody(item: js.Array[java.lang.String], message: js.Any): Validator = js.native
  def checkBody(item: scala.Double): Validator = js.native
  def checkBody(item: scala.Double, message: js.Any): Validator = js.native
  def checkBody(schema: js.Object): Validator = js.native
  def checkCookies(item: java.lang.String): Validator = js.native
  def checkCookies(item: java.lang.String, message: js.Any): Validator = js.native
  def checkCookies(item: js.Array[java.lang.String]): Validator = js.native
  def checkCookies(item: js.Array[java.lang.String], message: js.Any): Validator = js.native
  def checkCookies(item: scala.Double): Validator = js.native
  def checkCookies(item: scala.Double, message: js.Any): Validator = js.native
  def checkCookies(schema: js.Object): Validator = js.native
  def checkHeaders(item: java.lang.String): Validator = js.native
  def checkHeaders(item: java.lang.String, message: js.Any): Validator = js.native
  def checkHeaders(item: js.Array[java.lang.String]): Validator = js.native
  def checkHeaders(item: js.Array[java.lang.String], message: js.Any): Validator = js.native
  def checkHeaders(item: scala.Double): Validator = js.native
  def checkHeaders(item: scala.Double, message: js.Any): Validator = js.native
  def checkHeaders(schema: js.Object): Validator = js.native
  def checkParams(item: java.lang.String): Validator = js.native
  def checkParams(item: java.lang.String, message: js.Any): Validator = js.native
  def checkParams(item: js.Array[java.lang.String]): Validator = js.native
  def checkParams(item: js.Array[java.lang.String], message: js.Any): Validator = js.native
  def checkParams(item: scala.Double): Validator = js.native
  def checkParams(item: scala.Double, message: js.Any): Validator = js.native
  def checkParams(schema: js.Object): Validator = js.native
  def checkQuery(item: java.lang.String): Validator = js.native
  def checkQuery(item: java.lang.String, message: js.Any): Validator = js.native
  def checkQuery(item: js.Array[java.lang.String]): Validator = js.native
  def checkQuery(item: js.Array[java.lang.String], message: js.Any): Validator = js.native
  def checkQuery(item: scala.Double): Validator = js.native
  def checkQuery(item: scala.Double, message: js.Any): Validator = js.native
  def checkQuery(schema: js.Object): Validator = js.native
  def filter(item: java.lang.String): Sanitizer = js.native
  def getValidationResult(): js.Promise[expressDashValidatorLib.checkValidationDashResultMod.Result[_]] = js.native
  def sanitize(item: java.lang.String): Sanitizer = js.native
  def sanitizeBody(item: java.lang.String): Sanitizer = js.native
  def sanitizeCookies(item: java.lang.String): Sanitizer = js.native
  def sanitizeHeaders(item: java.lang.String): Sanitizer = js.native
  def sanitizeParams(item: java.lang.String): Sanitizer = js.native
  def sanitizeQuery(item: java.lang.String): Sanitizer = js.native
  def validate(item: java.lang.String): Validator = js.native
  def validate(item: java.lang.String, message: js.Any): Validator = js.native
  def validate(item: js.Array[java.lang.String]): Validator = js.native
  def validate(item: js.Array[java.lang.String], message: js.Any): Validator = js.native
  def validate(item: scala.Double): Validator = js.native
  def validate(item: scala.Double, message: js.Any): Validator = js.native
  def validate(schema: js.Object): Validator = js.native
  def validationErrors(): (stdLib.Record[java.lang.String, _]) | js.Array[_] = js.native
  def validationErrors(mapped: scala.Boolean): (stdLib.Record[java.lang.String, _]) | js.Array[_] = js.native
  @JSName("validationErrors")
  def validationErrors_T[T](): (stdLib.Record[java.lang.String, T]) | js.Array[T] = js.native
  @JSName("validationErrors")
  def validationErrors_T[T](mapped: scala.Boolean): (stdLib.Record[java.lang.String, T]) | js.Array[T] = js.native
}

