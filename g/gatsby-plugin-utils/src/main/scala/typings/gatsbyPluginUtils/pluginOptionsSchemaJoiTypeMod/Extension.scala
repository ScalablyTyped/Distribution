package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import typings.gatsbyPluginUtils.anon.Build
import typings.gatsbyPluginUtils.anon.To
import typings.std.Record
import typings.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extension extends js.Object {
  
  var args: js.UndefOr[js.Function1[/* repeated */ SchemaLike, Schema]] = js.native
  
  var base: js.UndefOr[Schema] = js.native
  
  /**
    * undocumented options
    */
  var cast: js.UndefOr[Record[String, To]] = js.native
  
  var coerce: js.UndefOr[CoerceFunction | CoerceObject] = js.native
  
  var flags: js.UndefOr[Record[String, ExtensionFlag]] = js.native
  
  var manifest: js.UndefOr[Build] = js.native
  
  var messages: js.UndefOr[LanguageMessages | String] = js.native
  
  var modifiers: js.UndefOr[Record[String, js.Function2[/* rule */ _, /* enabled */ js.UndefOr[Boolean], _]]] = js.native
  
  var overrides: js.UndefOr[Record[String, js.Function1[/* value */ _, Schema]]] = js.native
  
  var prepare: js.UndefOr[js.Function2[/* value */ js.Any, /* helpers */ CustomHelpers[_], _]] = js.native
  
  var properties: js.UndefOr[Record[String, _]] = js.native
  
  var rebuild: js.UndefOr[js.Function1[/* schema */ ExtensionBoundSchema, Unit]] = js.native
  
  var rules: js.UndefOr[Record[String, ExtensionRule with ThisType[SchemaInternals]]] = js.native
  
  var terms: js.UndefOr[Record[String, ExtensionTerm]] = js.native
  
  var `type`: String = js.native
  
  var validate: js.UndefOr[js.Function2[/* value */ js.Any, /* helpers */ CustomHelpers[_], _]] = js.native
}
object Extension {
  
  @scala.inline
  def apply(`type`: String): Extension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  
  @scala.inline
  implicit class ExtensionOps[Self <: Extension] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: /* repeated */ SchemaLike => Schema): Self = this.set("args", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setBase(value: Schema): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setCast(value: Record[String, To]): Self = this.set("cast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCast: Self = this.set("cast", js.undefined)
    
    @scala.inline
    def setCoerceFunction2(value: (/* value */ js.Any, /* helpers */ CustomHelpers[js.Any]) => CoerceResult): Self = this.set("coerce", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCoerce(value: CoerceFunction | CoerceObject): Self = this.set("coerce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoerce: Self = this.set("coerce", js.undefined)
    
    @scala.inline
    def setFlags(value: Record[String, ExtensionFlag]): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setManifest(value: Build): Self = this.set("manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifest: Self = this.set("manifest", js.undefined)
    
    @scala.inline
    def setMessages(value: LanguageMessages | String): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setModifiers(value: Record[String, js.Function2[/* rule */ _, /* enabled */ js.UndefOr[Boolean], _]]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    
    @scala.inline
    def setOverrides(value: Record[String, js.Function1[/* value */ _, Schema]]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setPrepare(value: (/* value */ js.Any, /* helpers */ CustomHelpers[_]) => _): Self = this.set("prepare", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePrepare: Self = this.set("prepare", js.undefined)
    
    @scala.inline
    def setProperties(value: Record[String, _]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setRebuild(value: /* schema */ ExtensionBoundSchema => Unit): Self = this.set("rebuild", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRebuild: Self = this.set("rebuild", js.undefined)
    
    @scala.inline
    def setRules(value: Record[String, ExtensionRule with ThisType[SchemaInternals]]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setTerms(value: Record[String, ExtensionTerm]): Self = this.set("terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerms: Self = this.set("terms", js.undefined)
    
    @scala.inline
    def setValidate(value: (/* value */ js.Any, /* helpers */ CustomHelpers[_]) => _): Self = this.set("validate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
