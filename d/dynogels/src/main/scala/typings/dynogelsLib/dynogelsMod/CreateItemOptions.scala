package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateItemOptions extends js.Object {
  var ConditionExpression: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ConditionExpression */ js.Any
  ] = js.undefined
  var ConditionalOperator: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ConditionalOperator */ js.Any
  ] = js.undefined
  var Expected: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ExpectedAttributeMap */ js.Any
  ] = js.undefined
  var ExpressionAttributeNames: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ExpressionAttributeNameMap */ js.Any
  ] = js.undefined
  var ExpressionAttributeValues: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ReturnConsumedCapacity */ js.Any
  ] = js.undefined
  var ReturnItemCollectionMetrics: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ReturnItemCollectionMetrics */ js.Any
  ] = js.undefined
  var ReturnValues: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ReturnValue */ js.Any
  ] = js.undefined
  var expected: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateItemOptions {
  @scala.inline
  def apply(
    ConditionExpression: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ConditionExpression */ js.Any = null,
    ConditionalOperator: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ConditionalOperator */ js.Any = null,
    Expected: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ExpectedAttributeMap */ js.Any = null,
    ExpressionAttributeNames: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ExpressionAttributeNameMap */ js.Any = null,
    ExpressionAttributeValues: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    ReturnConsumedCapacity: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ReturnConsumedCapacity */ js.Any = null,
    ReturnItemCollectionMetrics: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ReturnItemCollectionMetrics */ js.Any = null,
    ReturnValues: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ReturnValue */ js.Any = null,
    expected: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateItemOptions = {
    val __obj = js.Dynamic.literal()
    if (ConditionExpression != null) __obj.updateDynamic("ConditionExpression")(ConditionExpression)
    if (ConditionalOperator != null) __obj.updateDynamic("ConditionalOperator")(ConditionalOperator)
    if (Expected != null) __obj.updateDynamic("Expected")(Expected)
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames)
    if (ExpressionAttributeValues != null) __obj.updateDynamic("ExpressionAttributeValues")(ExpressionAttributeValues)
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity)
    if (ReturnItemCollectionMetrics != null) __obj.updateDynamic("ReturnItemCollectionMetrics")(ReturnItemCollectionMetrics)
    if (ReturnValues != null) __obj.updateDynamic("ReturnValues")(ReturnValues)
    if (expected != null) __obj.updateDynamic("expected")(expected)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    __obj.asInstanceOf[CreateItemOptions]
  }
}

