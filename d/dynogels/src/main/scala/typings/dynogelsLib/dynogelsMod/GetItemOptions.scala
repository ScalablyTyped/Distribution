package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetItemOptions extends js.Object {
  var AttributesToGet: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.AttributeNameList */ js.Any
  ] = js.undefined
  var ConsistentRead: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ConsistentRead */ js.Any
  ] = js.undefined
  var ExpressionAttributeNames: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ExpressionAttributeNameMap */ js.Any
  ] = js.undefined
  var ProjectionExpression: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ProjectionExpression */ js.Any
  ] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ReturnConsumedCapacity */ js.Any
  ] = js.undefined
}

object GetItemOptions {
  @scala.inline
  def apply(
    AttributesToGet: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.AttributeNameList */ js.Any = null,
    ConsistentRead: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ConsistentRead */ js.Any = null,
    ExpressionAttributeNames: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ExpressionAttributeNameMap */ js.Any = null,
    ProjectionExpression: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ProjectionExpression */ js.Any = null,
    ReturnConsumedCapacity: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ReturnConsumedCapacity */ js.Any = null
  ): GetItemOptions = {
    val __obj = js.Dynamic.literal()
    if (AttributesToGet != null) __obj.updateDynamic("AttributesToGet")(AttributesToGet)
    if (ConsistentRead != null) __obj.updateDynamic("ConsistentRead")(ConsistentRead)
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames)
    if (ProjectionExpression != null) __obj.updateDynamic("ProjectionExpression")(ProjectionExpression)
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity)
    __obj.asInstanceOf[GetItemOptions]
  }
}

