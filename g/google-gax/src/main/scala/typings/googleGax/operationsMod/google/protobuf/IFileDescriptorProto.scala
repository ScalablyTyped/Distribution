package typings.googleGax.operationsMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FileDescriptorProto. */
trait IFileDescriptorProto extends js.Object {
  /** FileDescriptorProto package */
  @JSName("package")
  var _package: js.UndefOr[String | Null] = js.undefined
  /** FileDescriptorProto dependency */
  var dependency: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** FileDescriptorProto enumType */
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto] | Null] = js.undefined
  /** FileDescriptorProto extension */
  var extension: js.UndefOr[js.Array[IFieldDescriptorProto] | Null] = js.undefined
  /** FileDescriptorProto messageType */
  var messageType: js.UndefOr[js.Array[IDescriptorProto] | Null] = js.undefined
  /** FileDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** FileDescriptorProto options */
  var options: js.UndefOr[IFileOptions | Null] = js.undefined
  /** FileDescriptorProto publicDependency */
  var publicDependency: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** FileDescriptorProto service */
  var service: js.UndefOr[js.Array[IServiceDescriptorProto] | Null] = js.undefined
  /** FileDescriptorProto sourceCodeInfo */
  var sourceCodeInfo: js.UndefOr[ISourceCodeInfo | Null] = js.undefined
  /** FileDescriptorProto syntax */
  var syntax: js.UndefOr[String | Null] = js.undefined
  /** FileDescriptorProto weakDependency */
  var weakDependency: js.UndefOr[js.Array[Double] | Null] = js.undefined
}

object IFileDescriptorProto {
  @scala.inline
  def apply(
    _package: js.UndefOr[Null | String] = js.undefined,
    dependency: js.UndefOr[Null | js.Array[String]] = js.undefined,
    enumType: js.UndefOr[Null | js.Array[IEnumDescriptorProto]] = js.undefined,
    extension: js.UndefOr[Null | js.Array[IFieldDescriptorProto]] = js.undefined,
    messageType: js.UndefOr[Null | js.Array[IDescriptorProto]] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    options: js.UndefOr[Null | IFileOptions] = js.undefined,
    publicDependency: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    service: js.UndefOr[Null | js.Array[IServiceDescriptorProto]] = js.undefined,
    sourceCodeInfo: js.UndefOr[Null | ISourceCodeInfo] = js.undefined,
    syntax: js.UndefOr[Null | String] = js.undefined,
    weakDependency: js.UndefOr[Null | js.Array[Double]] = js.undefined
  ): IFileDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_package)) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (!js.isUndefined(dependency)) __obj.updateDynamic("dependency")(dependency.asInstanceOf[js.Any])
    if (!js.isUndefined(enumType)) __obj.updateDynamic("enumType")(enumType.asInstanceOf[js.Any])
    if (!js.isUndefined(extension)) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (!js.isUndefined(messageType)) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(options)) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(publicDependency)) __obj.updateDynamic("publicDependency")(publicDependency.asInstanceOf[js.Any])
    if (!js.isUndefined(service)) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceCodeInfo)) __obj.updateDynamic("sourceCodeInfo")(sourceCodeInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(syntax)) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    if (!js.isUndefined(weakDependency)) __obj.updateDynamic("weakDependency")(weakDependency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDescriptorProto]
  }
}

