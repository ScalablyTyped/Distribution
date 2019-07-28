package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProtoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var dependencyList: js.Array[String]
  var enumTypeList: js.Array[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.AsObject
  ]
  var extensionList: js.Array[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.AsObject
  ]
  var messageTypeList: js.Array[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.AsObject
  ]
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.AsObject
  ] = js.undefined
  var pb_package: js.UndefOr[String] = js.undefined
  var publicDependencyList: js.Array[Double]
  var serviceList: js.Array[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProtoNs.AsObject
  ]
  var sourceCodeInfo: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.AsObject
  ] = js.undefined
  var syntax: js.UndefOr[String] = js.undefined
  var weakDependencyList: js.Array[Double]
}

object AsObject {
  @scala.inline
  def apply(
    dependencyList: js.Array[String],
    enumTypeList: js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.AsObject
    ],
    extensionList: js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.AsObject
    ],
    messageTypeList: js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.AsObject
    ],
    publicDependencyList: js.Array[Double],
    serviceList: js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProtoNs.AsObject
    ],
    weakDependencyList: js.Array[Double],
    name: String = null,
    options: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.AsObject = null,
    pb_package: String = null,
    sourceCodeInfo: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.AsObject = null,
    syntax: String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(dependencyList = dependencyList, enumTypeList = enumTypeList, extensionList = extensionList, messageTypeList = messageTypeList, publicDependencyList = publicDependencyList, serviceList = serviceList, weakDependencyList = weakDependencyList)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    if (pb_package != null) __obj.updateDynamic("pb_package")(pb_package)
    if (sourceCodeInfo != null) __obj.updateDynamic("sourceCodeInfo")(sourceCodeInfo)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    __obj.asInstanceOf[AsObject]
  }
}

