package typings.googleProtobuf.descriptorPbMod.FileOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var ccEnableArenas: js.UndefOr[Boolean] = js.native
  var ccGenericServices: js.UndefOr[Boolean] = js.native
  var csharpNamespace: js.UndefOr[String] = js.native
  var deprecated: js.UndefOr[Boolean] = js.native
  var goPackage: js.UndefOr[String] = js.native
  var javaGenerateEqualsAndHash: js.UndefOr[Boolean] = js.native
  var javaGenericServices: js.UndefOr[Boolean] = js.native
  var javaMultipleFiles: js.UndefOr[Boolean] = js.native
  var javaOuterClassname: js.UndefOr[String] = js.native
  var javaPackage: js.UndefOr[String] = js.native
  var javaStringCheckUtf8: js.UndefOr[Boolean] = js.native
  var objcClassPrefix: js.UndefOr[String] = js.native
  var optimizeFor: js.UndefOr[OptimizeMode] = js.native
  var phpClassPrefix: js.UndefOr[String] = js.native
  var phpGenericServices: js.UndefOr[Boolean] = js.native
  var phpMetadataNamespace: js.UndefOr[String] = js.native
  var phpNamespace: js.UndefOr[String] = js.native
  var pyGenericServices: js.UndefOr[Boolean] = js.native
  var rubyPackage: js.UndefOr[String] = js.native
  var swiftPrefix: js.UndefOr[String] = js.native
  var uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUninterpretedOptionListVarargs(value: typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject*): Self = this.set("uninterpretedOptionList", js.Array(value :_*))
    @scala.inline
    def setUninterpretedOptionList(value: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]): Self = this.set("uninterpretedOptionList", value.asInstanceOf[js.Any])
    @scala.inline
    def setCcEnableArenas(value: Boolean): Self = this.set("ccEnableArenas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCcEnableArenas: Self = this.set("ccEnableArenas", js.undefined)
    @scala.inline
    def setCcGenericServices(value: Boolean): Self = this.set("ccGenericServices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCcGenericServices: Self = this.set("ccGenericServices", js.undefined)
    @scala.inline
    def setCsharpNamespace(value: String): Self = this.set("csharpNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsharpNamespace: Self = this.set("csharpNamespace", js.undefined)
    @scala.inline
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    @scala.inline
    def setGoPackage(value: String): Self = this.set("goPackage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoPackage: Self = this.set("goPackage", js.undefined)
    @scala.inline
    def setJavaGenerateEqualsAndHash(value: Boolean): Self = this.set("javaGenerateEqualsAndHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJavaGenerateEqualsAndHash: Self = this.set("javaGenerateEqualsAndHash", js.undefined)
    @scala.inline
    def setJavaGenericServices(value: Boolean): Self = this.set("javaGenericServices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJavaGenericServices: Self = this.set("javaGenericServices", js.undefined)
    @scala.inline
    def setJavaMultipleFiles(value: Boolean): Self = this.set("javaMultipleFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJavaMultipleFiles: Self = this.set("javaMultipleFiles", js.undefined)
    @scala.inline
    def setJavaOuterClassname(value: String): Self = this.set("javaOuterClassname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJavaOuterClassname: Self = this.set("javaOuterClassname", js.undefined)
    @scala.inline
    def setJavaPackage(value: String): Self = this.set("javaPackage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJavaPackage: Self = this.set("javaPackage", js.undefined)
    @scala.inline
    def setJavaStringCheckUtf8(value: Boolean): Self = this.set("javaStringCheckUtf8", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJavaStringCheckUtf8: Self = this.set("javaStringCheckUtf8", js.undefined)
    @scala.inline
    def setObjcClassPrefix(value: String): Self = this.set("objcClassPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjcClassPrefix: Self = this.set("objcClassPrefix", js.undefined)
    @scala.inline
    def setOptimizeFor(value: OptimizeMode): Self = this.set("optimizeFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimizeFor: Self = this.set("optimizeFor", js.undefined)
    @scala.inline
    def setPhpClassPrefix(value: String): Self = this.set("phpClassPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhpClassPrefix: Self = this.set("phpClassPrefix", js.undefined)
    @scala.inline
    def setPhpGenericServices(value: Boolean): Self = this.set("phpGenericServices", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhpGenericServices: Self = this.set("phpGenericServices", js.undefined)
    @scala.inline
    def setPhpMetadataNamespace(value: String): Self = this.set("phpMetadataNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhpMetadataNamespace: Self = this.set("phpMetadataNamespace", js.undefined)
    @scala.inline
    def setPhpNamespace(value: String): Self = this.set("phpNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhpNamespace: Self = this.set("phpNamespace", js.undefined)
    @scala.inline
    def setPyGenericServices(value: Boolean): Self = this.set("pyGenericServices", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePyGenericServices: Self = this.set("pyGenericServices", js.undefined)
    @scala.inline
    def setRubyPackage(value: String): Self = this.set("rubyPackage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRubyPackage: Self = this.set("rubyPackage", js.undefined)
    @scala.inline
    def setSwiftPrefix(value: String): Self = this.set("swiftPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwiftPrefix: Self = this.set("swiftPrefix", js.undefined)
  }
  
}

