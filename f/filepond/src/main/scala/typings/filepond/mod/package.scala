package typings.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def OptionTypes: js.Object = typings.filepond.mod.^.asInstanceOf[js.Dynamic].selectDynamic("OptionTypes").asInstanceOf[js.Object]

@scala.inline
def create(): typings.filepond.anon.FilePond = typings.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.filepond.anon.FilePond]
@scala.inline
def create(element: scala.Unit, options: typings.filepond.mod.FilePondOptions): typings.filepond.anon.FilePond = (typings.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.filepond.anon.FilePond]
@scala.inline
def create(element: typings.std.Element): typings.filepond.anon.FilePond = typings.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[typings.filepond.anon.FilePond]
@scala.inline
def create(element: typings.std.Element, options: typings.filepond.mod.FilePondOptions): typings.filepond.anon.FilePond = (typings.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.filepond.anon.FilePond]

@scala.inline
def destroy(element: typings.std.Element): scala.Unit = typings.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(element.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def find(element: typings.std.Element): typings.filepond.anon.FilePond = typings.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("find")(element.asInstanceOf[js.Any]).asInstanceOf[typings.filepond.anon.FilePond]

@scala.inline
def getOptions(): typings.filepond.mod.FilePondOptions = typings.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")().asInstanceOf[typings.filepond.mod.FilePondOptions]

@scala.inline
def parse(context: typings.std.Element): scala.Unit = typings.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(context.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def registerPlugin(plugins: js.Any*): scala.Unit = typings.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(plugins.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def setOptions(options: typings.filepond.mod.FilePondOptions): scala.Unit = typings.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def supported(): scala.Boolean = typings.filepond.mod.^.asInstanceOf[js.Dynamic].applyDynamic("supported")().asInstanceOf[scala.Boolean]

type FetchServerConfigFunction = js.Function6[
/* url */ java.lang.String, 
/* load */ js.Function1[/* file */ typings.filepond.mod.ActualFileObject | typings.std.Blob, scala.Unit], 
/* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
/* progress */ typings.filepond.mod.ProgressServerConfigFunction, 
/* abort */ js.Function0[scala.Unit], 
/* headers */ js.Function1[/* headersString */ java.lang.String, scala.Unit], 
scala.Unit]

type LoadServerConfigFunction = js.Function6[
/* source */ js.Any, 
/* load */ js.Function1[/* file */ typings.filepond.mod.ActualFileObject | typings.std.Blob, scala.Unit], 
/* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
/* progress */ typings.filepond.mod.ProgressServerConfigFunction, 
/* abort */ js.Function0[scala.Unit], 
/* headers */ js.Function1[/* headersString */ java.lang.String, scala.Unit], 
scala.Unit]

type ProcessServerConfigFunction = js.Function7[
/* fieldName */ java.lang.String, 
/* file */ typings.filepond.mod.ActualFileObject, 
/* metadata */ org.scalablytyped.runtime.StringDictionary[js.Any], 
/* load */ js.Function1[
  /* p */ java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any], 
  scala.Unit
], 
/* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
/* progress */ typings.filepond.mod.ProgressServerConfigFunction, 
/* abort */ js.Function0[scala.Unit], 
scala.Unit]

type ProgressServerConfigFunction = js.Function3[
/* isLengthComputable */ scala.Boolean, 
/* loadedDataAmount */ scala.Double, 
/* totalDataAmount */ scala.Double, 
scala.Unit]

type RemoveServerConfigFunction = js.Function3[
/* source */ js.Any, 
/* load */ js.Function0[scala.Unit], 
/* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
scala.Unit]

type RestoreServerConfigFunction = js.Function6[
/* uniqueFileId */ js.Any, 
/* load */ js.Function1[/* file */ typings.filepond.mod.ActualFileObject, scala.Unit], 
/* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
/* progress */ typings.filepond.mod.ProgressServerConfigFunction, 
/* abort */ js.Function0[scala.Unit], 
/* headers */ js.Function1[/* headersString */ java.lang.String, scala.Unit], 
scala.Unit]

type RevertServerConfigFunction = js.Function3[
/* uniqueFieldId */ js.Any, 
/* load */ js.Function0[scala.Unit], 
/* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
scala.Unit]
