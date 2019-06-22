package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProtoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var dependencyList: js.Array[java.lang.String]
  var enumTypeList: js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.AsObject
  ]
  var extensionList: js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.AsObject
  ]
  var messageTypeList: js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.AsObject
  ]
  var name: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.AsObject
  ] = js.undefined
  var pb_package: js.UndefOr[java.lang.String] = js.undefined
  var publicDependencyList: js.Array[scala.Double]
  var serviceList: js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProtoNs.AsObject
  ]
  var sourceCodeInfo: js.UndefOr[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.AsObject
  ] = js.undefined
  var syntax: js.UndefOr[java.lang.String] = js.undefined
  var weakDependencyList: js.Array[scala.Double]
}

object AsObject {
  @scala.inline
  def apply(
    dependencyList: js.Array[java.lang.String],
    enumTypeList: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.AsObject
    ],
    extensionList: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.AsObject
    ],
    messageTypeList: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.AsObject
    ],
    publicDependencyList: js.Array[scala.Double],
    serviceList: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProtoNs.AsObject
    ],
    weakDependencyList: js.Array[scala.Double],
    name: java.lang.String = null,
    options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.AsObject = null,
    pb_package: java.lang.String = null,
    sourceCodeInfo: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.AsObject = null,
    syntax: java.lang.String = null
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

