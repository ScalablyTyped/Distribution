package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod.AwsLambdaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var awsRequestId: java.lang.String = js.native
  // Properties
  var callbackWaitsForEmptyEventLoop: scala.Boolean = js.native
  var clientContext: js.UndefOr[ClientContext] = js.native
  var functionName: java.lang.String = js.native
  var functionVersion: java.lang.String = js.native
  var identity: js.UndefOr[CognitoIdentity] = js.native
  var invokedFunctionArn: java.lang.String = js.native
  var logGroupName: java.lang.String = js.native
  var logStreamName: java.lang.String = js.native
  var memoryLimitInMB: scala.Double = js.native
  // Functions for compatibility with earlier Node.js Runtime v0.10.42
  // For more details see http://docs.aws.amazon.com/lambda/latest/dg/nodejs-prog-model-using-old-runtime.html#nodejs-prog-model-oldruntime-context-methods
  def done(): scala.Unit = js.native
  def done(error: stdLib.Error): scala.Unit = js.native
  def done(error: stdLib.Error, result: js.Any): scala.Unit = js.native
  def fail(error: java.lang.String): scala.Unit = js.native
  def fail(error: stdLib.Error): scala.Unit = js.native
  // Functions
  def getRemainingTimeInMillis(): scala.Double = js.native
  def succeed(messageOrObject: js.Any): scala.Unit = js.native
  def succeed(message: java.lang.String, `object`: js.Any): scala.Unit = js.native
}

