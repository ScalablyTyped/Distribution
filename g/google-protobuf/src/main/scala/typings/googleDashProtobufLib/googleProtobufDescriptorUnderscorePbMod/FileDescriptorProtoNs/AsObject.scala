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
  var options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.AsObject
  var `package`: js.UndefOr[java.lang.String] = js.undefined
  var publicDependencyList: js.Array[scala.Double]
  var serviceList: js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProtoNs.AsObject
  ]
  var sourceCodeInfo: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.AsObject
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
    options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.AsObject,
    publicDependencyList: js.Array[scala.Double],
    serviceList: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProtoNs.AsObject
    ],
    sourceCodeInfo: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.AsObject,
    weakDependencyList: js.Array[scala.Double],
    name: java.lang.String = null,
    `package`: java.lang.String = null,
    syntax: java.lang.String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(dependencyList = dependencyList, enumTypeList = enumTypeList, extensionList = extensionList, messageTypeList = messageTypeList, options = options, publicDependencyList = publicDependencyList, serviceList = serviceList, sourceCodeInfo = sourceCodeInfo, weakDependencyList = weakDependencyList)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    __obj.asInstanceOf[AsObject]
  }
}

