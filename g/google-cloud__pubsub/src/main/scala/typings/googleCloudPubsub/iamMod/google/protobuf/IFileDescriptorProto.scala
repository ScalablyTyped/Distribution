package typings.googleCloudPubsub.iamMod.google.protobuf

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
    _package: String = null,
    dependency: js.Array[String] = null,
    enumType: js.Array[IEnumDescriptorProto] = null,
    extension: js.Array[IFieldDescriptorProto] = null,
    messageType: js.Array[IDescriptorProto] = null,
    name: String = null,
    options: IFileOptions = null,
    publicDependency: js.Array[Double] = null,
    service: js.Array[IServiceDescriptorProto] = null,
    sourceCodeInfo: ISourceCodeInfo = null,
    syntax: String = null,
    weakDependency: js.Array[Double] = null
  ): IFileDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (dependency != null) __obj.updateDynamic("dependency")(dependency.asInstanceOf[js.Any])
    if (enumType != null) __obj.updateDynamic("enumType")(enumType.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (publicDependency != null) __obj.updateDynamic("publicDependency")(publicDependency.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (sourceCodeInfo != null) __obj.updateDynamic("sourceCodeInfo")(sourceCodeInfo.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    if (weakDependency != null) __obj.updateDynamic("weakDependency")(weakDependency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDescriptorProto]
  }
}

