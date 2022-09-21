package typings.dmgLicense

import typings.dmgLicense.anon.CreateOptionsincludeLangu
import typings.dmgLicense.anon.CreateOptionsincludeLanguIncludeLanguageName
import typings.dmgLicense.anon.OnNoLanguageName
import typings.dmgLicense.anon.`0`
import typings.dmgLicense.anon.`1`
import typings.dmgLicense.dmgLicenseStrings.agree
import typings.dmgLicense.dmgLicenseStrings.disagree
import typings.dmgLicense.dmgLicenseStrings.languageName
import typings.dmgLicense.dmgLicenseStrings.message
import typings.dmgLicense.dmgLicenseStrings.print
import typings.dmgLicense.dmgLicenseStrings.save
import typings.dmgLicense.formatVerrorMod.PrettyVError
import typings.dmgLicense.labelsMod.Labels.CreateOptions
import typings.dmgLicense.labelsMod.Labels.ForEachOptions
import typings.dmgLicense.labelsMod.Labels.MapOptions
import typings.dmgLicense.labelsMod.Labels.WithLanguageName
import typings.dmgLicense.labelsMod.Labels.WithoutLanguageName
import typings.dmgLicense.languageMod.LangSpecs
import typings.dmgLicense.languageMod.Localization
import typings.dmgLicense.languageMod.default
import typings.dmgLicense.mod.Options
import typings.node.bufferMod.global.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelsMod {
  
  object default {
    
    @JSImport("dmg-license/lib/Labels", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          T
        ]
    ): Labels[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(fun.asInstanceOf[js.Any]).asInstanceOf[Labels[T]]
    inline def create[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          T
        ],
      options: CreateOptionsincludeLangu
    ): WithLanguageName[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WithLanguageName[T]]
    inline def create[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          T
        ],
      options: CreateOptionsincludeLanguIncludeLanguageName
    ): WithoutLanguageName[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WithoutLanguageName[T]]
    inline def create[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          T
        ],
      options: CreateOptions
    ): Labels[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Labels[T]]
    
    inline def createAsync[T](
      fun: js.Function2[
          agree | disagree | languageName | message | print | save, 
          /* index */ Double, 
          js.Promise[T]
        ]
    ): js.Promise[WithoutLanguageName[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(fun.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WithoutLanguageName[T]]]
    inline def createAsync[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          js.Promise[T]
        ],
      options: CreateOptionsincludeLangu
    ): js.Promise[WithLanguageName[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithLanguageName[T]]]
    inline def createAsync[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          js.Promise[T]
        ],
      options: CreateOptionsincludeLanguIncludeLanguageName
    ): js.Promise[WithoutLanguageName[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithoutLanguageName[T]]]
    inline def createAsync[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          js.Promise[T]
        ],
      options: CreateOptions
    ): js.Promise[Labels[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Labels[T]]]
    
    inline def create_T_WithoutLanguageName[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          T
        ]
    ): WithoutLanguageName[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(fun.asInstanceOf[js.Any]).asInstanceOf[WithoutLanguageName[T]]
    
    /* Inlined std.Readonly<{  languageName :string,   agree :string,   disagree :string,   print :string,   save :string,   message :string}> */
    object descriptions {
      
      @JSImport("dmg-license/lib/Labels", "default.descriptions.agree")
      @js.native
      val agree: String = js.native
      
      @JSImport("dmg-license/lib/Labels", "default.descriptions.disagree")
      @js.native
      val disagree: String = js.native
      
      @JSImport("dmg-license/lib/Labels", "default.descriptions.languageName")
      @js.native
      val languageName: String = js.native
      
      @JSImport("dmg-license/lib/Labels", "default.descriptions.message")
      @js.native
      val message: String = js.native
      
      @JSImport("dmg-license/lib/Labels", "default.descriptions.print")
      @js.native
      val print: String = js.native
      
      @JSImport("dmg-license/lib/Labels", "default.descriptions.save")
      @js.native
      val save: String = js.native
    }
    
    inline def forEach[T](
      labels: Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forEach[T](
      labels: Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          Unit
        ],
      hasOnNoLanguageName: ForEachOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], hasOnNoLanguageName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def fromPromises[T](labels: Labels[js.Promise[T]]): js.Promise[Labels[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromises")(labels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Labels[T]]]
    inline def fromPromises[T](labels: WithLanguageName[js.Promise[T]]): js.Promise[WithLanguageName[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromises")(labels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WithLanguageName[T]]]
    inline def fromPromises[T](labels: WithoutLanguageName[js.Promise[T]]): js.Promise[WithoutLanguageName[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromises")(labels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WithoutLanguageName[T]]]
    
    inline def map[T, U](
      labels: WithLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          U
        ]
    ): WithLanguageName[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[WithLanguageName[U]]
    inline def map[T, U](
      labels: WithLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          U
        ],
      options: MapOptions[T, U]
    ): WithLanguageName[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WithLanguageName[U]]
    inline def map[T, U](
      labels: WithoutLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          U
        ]
    ): WithoutLanguageName[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[WithoutLanguageName[U]]
    inline def map[T, U](
      labels: WithoutLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          U
        ],
      options: (MapOptions[T, U]) & OnNoLanguageName
    ): WithoutLanguageName[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WithoutLanguageName[U]]
    inline def map[T, U](
      labels: Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          U
        ]
    ): Labels[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Labels[U]]
    inline def map[T, U](
      labels: Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          U
        ],
      options: (MapOptions[T, U]) & `1`[U]
    ): WithLanguageName[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WithLanguageName[U]]
    inline def map[T, U](
      labels: Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          U
        ],
      options: MapOptions[T, U]
    ): Labels[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Labels[U]]
    
    inline def mapAsync[T, U](
      labels: WithLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          js.Promise[U]
        ]
    ): js.Promise[WithLanguageName[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithLanguageName[U]]]
    inline def mapAsync[T, U](
      labels: WithLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          js.Promise[U]
        ],
      options: MapOptions[T, js.Promise[U]]
    ): js.Promise[WithLanguageName[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithLanguageName[U]]]
    inline def mapAsync[T, U](
      labels: WithoutLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          js.Promise[U]
        ]
    ): js.Promise[WithoutLanguageName[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithoutLanguageName[U]]]
    inline def mapAsync[T, U](
      labels: WithoutLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          js.Promise[U]
        ],
      options: (MapOptions[T, js.Promise[U]]) & OnNoLanguageName
    ): js.Promise[WithoutLanguageName[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithoutLanguageName[U]]]
    inline def mapAsync[T, U](
      labels: Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          js.Promise[U]
        ]
    ): js.Promise[Labels[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Labels[U]]]
    inline def mapAsync[T, U](
      labels: Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          js.Promise[U]
        ],
      options: (MapOptions[T, js.Promise[U]]) & `0`[U]
    ): js.Promise[WithLanguageName[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithLanguageName[U]]]
    inline def mapAsync[T, U](
      labels: Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          js.Promise[U]
        ],
      options: MapOptions[T, js.Promise[U]]
    ): js.Promise[Labels[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Labels[U]]]
    
    @JSImport("dmg-license/lib/Labels", "default.names")
    @js.native
    val names: js.Array[message | languageName | agree | disagree | print | save] = js.native
    
    /**
      * Prepares a label set for insertion into a disk image as a `STR#` resource.
      *
      * @remarks
      * Throws {@link LabelEncodingError} if there is a problem encoding some of the labels.
      *
      * Throws {@link verror#MultiError} if there is more than one error.
      *
      * @param labels - The label set to prepare.
      *
      * @param lang - The language to prepare the label set for. This determines the target character set.
      *
      * @returns A `Buffer` in `STR#` format.
      */
    inline def prepare(labels: Labels[String], lang: typings.dmgLicense.languageMod.default): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    /**
      * Prepares the given language's default label set for insertion into a disk image as a `STR#` resource.
      *
      * @remarks
      * Throws {@link NoDefaultLabelsError} if there is no default label set for the given language.
      *
      * Throws {@link LabelEncodingError} if there is a problem encoding some of the labels.
      *
      * Throws a {@link verror#MultiError} if there is more than one error.
      *
      * @param lang - The language to prepare the label set for.
      *
      * @param contextOrOptions - Context of an existing {@link dmgLicense} run, or options for one (when calling this function standalone).
      *
      * @returns A `Buffer` in `STR#` format.
      */
    inline def prepareDefault(lang: typings.dmgLicense.languageMod.default): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareDefault")(lang.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def prepareSpec(
      labels: Null,
      lang: typings.dmgLicense.languageMod.default,
      contextOrOptions: typings.dmgLicense.contextMod.default
    ): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def prepareSpec(labels: Null, lang: typings.dmgLicense.languageMod.default, contextOrOptions: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def prepareSpec(
      labels: Unit,
      lang: typings.dmgLicense.languageMod.default,
      contextOrOptions: typings.dmgLicense.contextMod.default
    ): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def prepareSpec(labels: Unit, lang: typings.dmgLicense.languageMod.default, contextOrOptions: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    /**
      * Prepares a label set for insertion into a disk image as a `STR#` resource.
      *
      * @remarks
      * This function delegates to `prepareDefault` or `prepare` as appropriate.
      *
      * Throws {@link NoDefaultLabelsError} if `labels` is `null` or `undefined` and there is no default label set for the given language.
      *
      * Throws {@link LabelEncodingError} if there is a problem encoding some of the labels.
      *
      * Throws a {@link verror#MultiError} if there is more than one error.
      *
      * @param labels - An object describing the label set to prepare. If `null` or `undefined`, the default label set for the given language is used instead.
      *
      * @param lang - The language to prepare the label set for. This determines the target character set, and if `labels` is `null` or `undefined`, which language's default label set to use.
      *
      * @param contextOrOptions - Context of an existing {@link dmgLicense} run, or options for one (when calling this function standalone). Used to resolve relative paths if `labels` is a `LabelsSpec.LabelsRaw`.
      *
      * @returns A `Buffer` in `STR#` format.
      */
    inline def prepareSpec(
      labels: LabelsSpec,
      lang: typings.dmgLicense.languageMod.default,
      contextOrOptions: typings.dmgLicense.contextMod.default
    ): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def prepareSpec(labels: LabelsSpec, lang: typings.dmgLicense.languageMod.default, contextOrOptions: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  }
  
  @JSImport("dmg-license/lib/Labels", "LabelEncodingError")
  @js.native
  open class LabelEncodingError protected () extends PrettyVError {
    def this(labelDescription: String, lang: default, cause: String, params: Any*) = this()
    def this(labelDescription: String, lang: default, cause: js.Error, params: Any*) = this()
    def this(labelDescription: String, lang: default, cause: Unit, params: Any*) = this()
    
    var text: js.UndefOr[Buffer] = js.native
  }
  
  trait Labels[T] extends StObject {
    
    var agree: T
    
    var disagree: T
    
    var languageName: js.UndefOr[T] = js.undefined
    
    var message: T
    
    var print: T
    
    var save: T
  }
  object Labels {
    
    inline def apply[T](agree: T, disagree: T, message: T, print: T, save: T): Labels[T] = {
      val __obj = js.Dynamic.literal(agree = agree.asInstanceOf[js.Any], disagree = disagree.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
      __obj.asInstanceOf[Labels[T]]
    }
    
    @JSImport("dmg-license/lib/Labels", "Labels")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          T
        ]
    ): Labels[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(fun.asInstanceOf[js.Any]).asInstanceOf[Labels[T]]
    inline def create[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          T
        ],
      options: CreateOptionsincludeLangu
    ): WithLanguageName[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WithLanguageName[T]]
    inline def create[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          T
        ],
      options: CreateOptionsincludeLanguIncludeLanguageName
    ): WithoutLanguageName[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WithoutLanguageName[T]]
    inline def create[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          T
        ],
      options: CreateOptions
    ): Labels[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Labels[T]]
    
    inline def createAsync[T](
      fun: js.Function2[
          agree | disagree | languageName | message | print | save, 
          /* index */ Double, 
          js.Promise[T]
        ]
    ): js.Promise[WithoutLanguageName[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(fun.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WithoutLanguageName[T]]]
    inline def createAsync[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          js.Promise[T]
        ],
      options: CreateOptionsincludeLangu
    ): js.Promise[WithLanguageName[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithLanguageName[T]]]
    inline def createAsync[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          js.Promise[T]
        ],
      options: CreateOptionsincludeLanguIncludeLanguageName
    ): js.Promise[WithoutLanguageName[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithoutLanguageName[T]]]
    inline def createAsync[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          js.Promise[T]
        ],
      options: CreateOptions
    ): js.Promise[Labels[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Labels[T]]]
    
    inline def create_T_WithoutLanguageName[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          T
        ]
    ): WithoutLanguageName[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(fun.asInstanceOf[js.Any]).asInstanceOf[WithoutLanguageName[T]]
    
    /* Inlined std.Readonly<{  languageName :string,   agree :string,   disagree :string,   print :string,   save :string,   message :string}> */
    object descriptions {
      
      @JSImport("dmg-license/lib/Labels", "Labels.descriptions.agree")
      @js.native
      val agree: String = js.native
      
      @JSImport("dmg-license/lib/Labels", "Labels.descriptions.disagree")
      @js.native
      val disagree: String = js.native
      
      @JSImport("dmg-license/lib/Labels", "Labels.descriptions.languageName")
      @js.native
      val languageName: String = js.native
      
      @JSImport("dmg-license/lib/Labels", "Labels.descriptions.message")
      @js.native
      val message: String = js.native
      
      @JSImport("dmg-license/lib/Labels", "Labels.descriptions.print")
      @js.native
      val print: String = js.native
      
      @JSImport("dmg-license/lib/Labels", "Labels.descriptions.save")
      @js.native
      val save: String = js.native
    }
    
    inline def forEach[T](
      labels: Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forEach[T](
      labels: Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          Unit
        ],
      hasOnNoLanguageName: ForEachOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], hasOnNoLanguageName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def fromPromises[T](labels: Labels[js.Promise[T]]): js.Promise[Labels[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromises")(labels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Labels[T]]]
    inline def fromPromises[T](labels: WithLanguageName[js.Promise[T]]): js.Promise[WithLanguageName[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromises")(labels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WithLanguageName[T]]]
    inline def fromPromises[T](labels: WithoutLanguageName[js.Promise[T]]): js.Promise[WithoutLanguageName[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromises")(labels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WithoutLanguageName[T]]]
    
    inline def map[T, U](
      labels: WithLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          U
        ]
    ): WithLanguageName[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[WithLanguageName[U]]
    inline def map[T, U](
      labels: WithLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          U
        ],
      options: MapOptions[T, U]
    ): WithLanguageName[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WithLanguageName[U]]
    inline def map[T, U](
      labels: WithoutLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          U
        ]
    ): WithoutLanguageName[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[WithoutLanguageName[U]]
    inline def map[T, U](
      labels: WithoutLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          U
        ],
      options: (MapOptions[T, U]) & OnNoLanguageName
    ): WithoutLanguageName[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WithoutLanguageName[U]]
    inline def map[T, U](
      labels: Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          U
        ]
    ): Labels[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Labels[U]]
    inline def map[T, U](
      labels: Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          U
        ],
      options: (MapOptions[T, U]) & `1`[U]
    ): WithLanguageName[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WithLanguageName[U]]
    inline def map[T, U](
      labels: Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          U
        ],
      options: MapOptions[T, U]
    ): Labels[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Labels[U]]
    
    inline def mapAsync[T, U](
      labels: WithLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          js.Promise[U]
        ]
    ): js.Promise[WithLanguageName[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithLanguageName[U]]]
    inline def mapAsync[T, U](
      labels: WithLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          js.Promise[U]
        ],
      options: MapOptions[T, js.Promise[U]]
    ): js.Promise[WithLanguageName[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithLanguageName[U]]]
    inline def mapAsync[T, U](
      labels: WithoutLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          js.Promise[U]
        ]
    ): js.Promise[WithoutLanguageName[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithoutLanguageName[U]]]
    inline def mapAsync[T, U](
      labels: WithoutLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          js.Promise[U]
        ],
      options: (MapOptions[T, js.Promise[U]]) & OnNoLanguageName
    ): js.Promise[WithoutLanguageName[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithoutLanguageName[U]]]
    inline def mapAsync[T, U](
      labels: Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          js.Promise[U]
        ]
    ): js.Promise[Labels[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Labels[U]]]
    inline def mapAsync[T, U](
      labels: Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          js.Promise[U]
        ],
      options: (MapOptions[T, js.Promise[U]]) & `0`[U]
    ): js.Promise[WithLanguageName[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithLanguageName[U]]]
    inline def mapAsync[T, U](
      labels: Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ Labels[T], 
          js.Promise[U]
        ],
      options: MapOptions[T, js.Promise[U]]
    ): js.Promise[Labels[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Labels[U]]]
    
    @JSImport("dmg-license/lib/Labels", "Labels.names")
    @js.native
    val names: js.Array[message | languageName | agree | disagree | print | save] = js.native
    
    /**
      * Prepares a label set for insertion into a disk image as a `STR#` resource.
      *
      * @remarks
      * Throws {@link LabelEncodingError} if there is a problem encoding some of the labels.
      *
      * Throws {@link verror#MultiError} if there is more than one error.
      *
      * @param labels - The label set to prepare.
      *
      * @param lang - The language to prepare the label set for. This determines the target character set.
      *
      * @returns A `Buffer` in `STR#` format.
      */
    inline def prepare(labels: Labels[String], lang: default): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    /**
      * Prepares the given language's default label set for insertion into a disk image as a `STR#` resource.
      *
      * @remarks
      * Throws {@link NoDefaultLabelsError} if there is no default label set for the given language.
      *
      * Throws {@link LabelEncodingError} if there is a problem encoding some of the labels.
      *
      * Throws a {@link verror#MultiError} if there is more than one error.
      *
      * @param lang - The language to prepare the label set for.
      *
      * @param contextOrOptions - Context of an existing {@link dmgLicense} run, or options for one (when calling this function standalone).
      *
      * @returns A `Buffer` in `STR#` format.
      */
    inline def prepareDefault(lang: default): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareDefault")(lang.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def prepareSpec(labels: Null, lang: default, contextOrOptions: typings.dmgLicense.contextMod.default): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def prepareSpec(labels: Null, lang: default, contextOrOptions: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def prepareSpec(labels: Unit, lang: default, contextOrOptions: typings.dmgLicense.contextMod.default): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def prepareSpec(labels: Unit, lang: default, contextOrOptions: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    /**
      * Prepares a label set for insertion into a disk image as a `STR#` resource.
      *
      * @remarks
      * This function delegates to `prepareDefault` or `prepare` as appropriate.
      *
      * Throws {@link NoDefaultLabelsError} if `labels` is `null` or `undefined` and there is no default label set for the given language.
      *
      * Throws {@link LabelEncodingError} if there is a problem encoding some of the labels.
      *
      * Throws a {@link verror#MultiError} if there is more than one error.
      *
      * @param labels - An object describing the label set to prepare. If `null` or `undefined`, the default label set for the given language is used instead.
      *
      * @param lang - The language to prepare the label set for. This determines the target character set, and if `labels` is `null` or `undefined`, which language's default label set to use.
      *
      * @param contextOrOptions - Context of an existing {@link dmgLicense} run, or options for one (when calling this function standalone). Used to resolve relative paths if `labels` is a `LabelsSpec.LabelsRaw`.
      *
      * @returns A `Buffer` in `STR#` format.
      */
    inline def prepareSpec(labels: LabelsSpec, lang: default, contextOrOptions: typings.dmgLicense.contextMod.default): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def prepareSpec(labels: LabelsSpec, lang: default, contextOrOptions: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    
    trait CreateOptions extends StObject {
      
      var includeLanguageName: js.UndefOr[Boolean] = js.undefined
    }
    object CreateOptions {
      
      inline def apply(): CreateOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateOptions]
      }
      
      extension [Self <: CreateOptions](x: Self) {
        
        inline def setIncludeLanguageName(value: Boolean): Self = StObject.set(x, "includeLanguageName", value.asInstanceOf[js.Any])
        
        inline def setIncludeLanguageNameUndefined: Self = StObject.set(x, "includeLanguageName", js.undefined)
      }
    }
    
    trait ForEachOptions extends StObject {
      
      var onNoLanguageName: js.UndefOr[js.Function0[Unit]] = js.undefined
    }
    object ForEachOptions {
      
      inline def apply(): ForEachOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ForEachOptions]
      }
      
      extension [Self <: ForEachOptions](x: Self) {
        
        inline def setOnNoLanguageName(value: () => Unit): Self = StObject.set(x, "onNoLanguageName", js.Any.fromFunction0(value))
        
        inline def setOnNoLanguageNameUndefined: Self = StObject.set(x, "onNoLanguageName", js.undefined)
      }
    }
    
    extension [Self <: Labels[?], T](x: Self & Labels[T]) {
      
      inline def setAgree(value: T): Self = StObject.set(x, "agree", value.asInstanceOf[js.Any])
      
      inline def setDisagree(value: T): Self = StObject.set(x, "disagree", value.asInstanceOf[js.Any])
      
      inline def setLanguageName(value: T): Self = StObject.set(x, "languageName", value.asInstanceOf[js.Any])
      
      inline def setLanguageNameUndefined: Self = StObject.set(x, "languageName", js.undefined)
      
      inline def setMessage(value: T): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPrint(value: T): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      inline def setSave(value: T): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    }
    
    trait MapOptions[T, U] extends StObject {
      
      var onNoLanguageName: js.UndefOr[js.Function0[U]] = js.undefined
    }
    object MapOptions {
      
      inline def apply[T, U](): MapOptions[T, U] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MapOptions[T, U]]
      }
      
      extension [Self <: MapOptions[?, ?], T, U](x: Self & (MapOptions[T, U])) {
        
        inline def setOnNoLanguageName(value: () => U): Self = StObject.set(x, "onNoLanguageName", js.Any.fromFunction0(value))
        
        inline def setOnNoLanguageNameUndefined: Self = StObject.set(x, "onNoLanguageName", js.undefined)
      }
    }
    
    trait WithLanguageName[T]
      extends StObject
         with Labels[T] {
      
      @JSName("languageName")
      var languageName_WithLanguageName: T
    }
    object WithLanguageName {
      
      inline def apply[T](agree: T, disagree: T, languageName: T, message: T, print: T, save: T): WithLanguageName[T] = {
        val __obj = js.Dynamic.literal(agree = agree.asInstanceOf[js.Any], disagree = disagree.asInstanceOf[js.Any], languageName = languageName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
        __obj.asInstanceOf[WithLanguageName[T]]
      }
      
      extension [Self <: WithLanguageName[?], T](x: Self & WithLanguageName[T]) {
        
        inline def setLanguageName(value: T): Self = StObject.set(x, "languageName", value.asInstanceOf[js.Any])
      }
    }
    
    trait WithoutLanguageName[T]
      extends StObject
         with Labels[T] {
      
      @JSName("languageName")
      var languageName_WithoutLanguageName: js.UndefOr[scala.Nothing] = js.undefined
    }
    object WithoutLanguageName {
      
      inline def apply[T](agree: T, disagree: T, message: T, print: T, save: T): WithoutLanguageName[T] = {
        val __obj = js.Dynamic.literal(agree = agree.asInstanceOf[js.Any], disagree = disagree.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
        __obj.asInstanceOf[WithoutLanguageName[T]]
      }
    }
  }
  
  @JSImport("dmg-license/lib/Labels", "NoDefaultLabelsError")
  @js.native
  open class NoDefaultLabelsError protected ()
    extends StObject
       with Error {
    def this(lang: default) = this()
    def this(lang: default, message: String) = this()
    
    val lang: default = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dmgLicense.labelsMod.LabelsSpec.LabelsInline
    - typings.dmgLicense.labelsMod.LabelsSpec.LabelsRaw
  */
  trait LabelsSpec extends StObject
  object LabelsSpec {
    
    trait LabelsInline
      extends StObject
         with Localization
         with Labels[String]
         with LabelsSpec {
      
      var file: js.UndefOr[scala.Nothing] = js.undefined
    }
    object LabelsInline {
      
      inline def apply(agree: String, disagree: String, lang: LangSpecs, message: String, print: String, save: String): LabelsInline = {
        val __obj = js.Dynamic.literal(agree = agree.asInstanceOf[js.Any], disagree = disagree.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
        __obj.asInstanceOf[LabelsInline]
      }
    }
    
    trait LabelsRaw
      extends StObject
         with Localization
         with NoLabels
         with LabelsSpec {
      
      var file: String
    }
    object LabelsRaw {
      
      inline def apply(
        agree: Unit,
        disagree: Unit,
        file: String,
        lang: LangSpecs,
        languageName: Unit,
        message: Unit,
        print: Unit,
        save: Unit
      ): LabelsRaw = {
        val __obj = js.Dynamic.literal(agree = agree.asInstanceOf[js.Any], disagree = disagree.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], languageName = languageName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
        __obj.asInstanceOf[LabelsRaw]
      }
      
      extension [Self <: LabelsRaw](x: Self) {
        
        inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* Inlined parent std.Partial<dmg-license.dmg-license/lib/Labels.Labels<undefined>> */
  trait NoLabels extends StObject {
    
    var agree: Unit
    
    var disagree: Unit
    
    var languageName: Unit
    
    var message: Unit
    
    var print: Unit
    
    var save: Unit
  }
  object NoLabels {
    
    inline def apply(agree: Unit, disagree: Unit, languageName: Unit, message: Unit, print: Unit, save: Unit): NoLabels = {
      val __obj = js.Dynamic.literal(agree = agree.asInstanceOf[js.Any], disagree = disagree.asInstanceOf[js.Any], languageName = languageName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoLabels]
    }
    
    extension [Self <: NoLabels](x: Self) {
      
      inline def setAgree(value: Unit): Self = StObject.set(x, "agree", value.asInstanceOf[js.Any])
      
      inline def setDisagree(value: Unit): Self = StObject.set(x, "disagree", value.asInstanceOf[js.Any])
      
      inline def setLanguageName(value: Unit): Self = StObject.set(x, "languageName", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: Unit): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPrint(value: Unit): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      inline def setSave(value: Unit): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    }
  }
}
