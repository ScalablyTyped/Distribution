package typings.dialogflow.protosProtosMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FileDescriptorProto. */
trait IFileDescriptorProto extends js.Object {
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
  /** FileDescriptorProto package */
  var `package`: js.UndefOr[String | Null] = js.undefined
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
    dependency: js.Array[String] = null,
    enumType: js.Array[IEnumDescriptorProto] = null,
    extension: js.Array[IFieldDescriptorProto] = null,
    messageType: js.Array[IDescriptorProto] = null,
    name: String = null,
    options: IFileOptions = null,
    `package`: String = null,
    publicDependency: js.Array[Double] = null,
    service: js.Array[IServiceDescriptorProto] = null,
    sourceCodeInfo: ISourceCodeInfo = null,
    syntax: String = null,
    weakDependency: js.Array[Double] = null
  ): IFileDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (dependency != null) __obj.updateDynamic("dependency")(dependency)
    if (enumType != null) __obj.updateDynamic("enumType")(enumType)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (messageType != null) __obj.updateDynamic("messageType")(messageType)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (publicDependency != null) __obj.updateDynamic("publicDependency")(publicDependency)
    if (service != null) __obj.updateDynamic("service")(service)
    if (sourceCodeInfo != null) __obj.updateDynamic("sourceCodeInfo")(sourceCodeInfo)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    if (weakDependency != null) __obj.updateDynamic("weakDependency")(weakDependency)
    __obj.asInstanceOf[IFileDescriptorProto]
  }
}

