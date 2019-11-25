package typings.dynogels.dynogelsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateItemOptions extends js.Object {
  var AttributeUpdates: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.AttributeUpdates */ js.Any
  ] = js.undefined
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
  var ExpressionAttributeValues: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ReturnConsumedCapacity */ js.Any
  ] = js.undefined
  var ReturnItemCollectionMetrics: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ReturnItemCollectionMetrics */ js.Any
  ] = js.undefined
  var ReturnValues: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ReturnValue */ js.Any
  ] = js.undefined
  var UpdateExpression: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.UpdateExpression */ js.Any
  ] = js.undefined
  var expected: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object UpdateItemOptions {
  @scala.inline
  def apply(
    AttributeUpdates: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.AttributeUpdates */ js.Any = null,
    ConditionExpression: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ConditionExpression */ js.Any = null,
    ConditionalOperator: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ConditionalOperator */ js.Any = null,
    Expected: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ExpectedAttributeMap */ js.Any = null,
    ExpressionAttributeNames: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ExpressionAttributeNameMap */ js.Any = null,
    ExpressionAttributeValues: StringDictionary[js.Any] = null,
    ReturnConsumedCapacity: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ReturnConsumedCapacity */ js.Any = null,
    ReturnItemCollectionMetrics: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ReturnItemCollectionMetrics */ js.Any = null,
    ReturnValues: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ReturnValue */ js.Any = null,
    UpdateExpression: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.UpdateExpression */ js.Any = null,
    expected: StringDictionary[js.Any] = null
  ): UpdateItemOptions = {
    val __obj = js.Dynamic.literal()
    if (AttributeUpdates != null) __obj.updateDynamic("AttributeUpdates")(AttributeUpdates.asInstanceOf[js.Any])
    if (ConditionExpression != null) __obj.updateDynamic("ConditionExpression")(ConditionExpression.asInstanceOf[js.Any])
    if (ConditionalOperator != null) __obj.updateDynamic("ConditionalOperator")(ConditionalOperator.asInstanceOf[js.Any])
    if (Expected != null) __obj.updateDynamic("Expected")(Expected.asInstanceOf[js.Any])
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames.asInstanceOf[js.Any])
    if (ExpressionAttributeValues != null) __obj.updateDynamic("ExpressionAttributeValues")(ExpressionAttributeValues.asInstanceOf[js.Any])
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity.asInstanceOf[js.Any])
    if (ReturnItemCollectionMetrics != null) __obj.updateDynamic("ReturnItemCollectionMetrics")(ReturnItemCollectionMetrics.asInstanceOf[js.Any])
    if (ReturnValues != null) __obj.updateDynamic("ReturnValues")(ReturnValues.asInstanceOf[js.Any])
    if (UpdateExpression != null) __obj.updateDynamic("UpdateExpression")(UpdateExpression.asInstanceOf[js.Any])
    if (expected != null) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateItemOptions]
  }
}

