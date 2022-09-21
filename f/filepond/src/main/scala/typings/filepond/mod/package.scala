package typings.filepond.mod

import org.scalablytyped.runtime.StringDictionary
import typings.filepond.mod.^
import typings.std.Blob
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def OptionTypes: js.Object = ^.asInstanceOf[js.Dynamic].selectDynamic("OptionTypes").asInstanceOf[js.Object]

inline def create(): typings.filepond.anon.FilePond = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.filepond.anon.FilePond]
inline def create(element: Unit, options: FilePondOptions): typings.filepond.anon.FilePond = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.filepond.anon.FilePond]
inline def create(element: Element): typings.filepond.anon.FilePond = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[typings.filepond.anon.FilePond]
inline def create(element: Element, options: FilePondOptions): typings.filepond.anon.FilePond = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.filepond.anon.FilePond]

inline def destroy(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def find(element: Element): typings.filepond.anon.FilePond = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(element.asInstanceOf[js.Any]).asInstanceOf[typings.filepond.anon.FilePond]

inline def getOptions(): FilePondOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")().asInstanceOf[FilePondOptions]

inline def parse(context: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(context.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def registerPlugin(plugins: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(plugins.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]

inline def setOptions(options: FilePondOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def supported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supported")().asInstanceOf[Boolean]

type FetchServerConfigFunction = js.Function6[
/* url */ String, 
/* load */ js.Function1[/* file */ ActualFileObject | Blob, Unit], 
/* error */ js.Function1[/* errorText */ String, Unit], 
/* progress */ ProgressServerConfigFunction, 
/* abort */ js.Function0[Unit], 
/* headers */ js.Function1[/* headersString */ String, Unit], 
Unit]

type LoadServerConfigFunction = js.Function6[
/* source */ Any, 
/* load */ js.Function1[/* file */ ActualFileObject | Blob, Unit], 
/* error */ js.Function1[/* errorText */ String, Unit], 
/* progress */ ProgressServerConfigFunction, 
/* abort */ js.Function0[Unit], 
/* headers */ js.Function1[/* headersString */ String, Unit], 
Unit]

type ProcessServerConfigFunction = js.Function9[
/* fieldName */ String, 
/* file */ ActualFileObject, 
/* metadata */ StringDictionary[Any], 
/* load */ js.Function1[/* p */ String | StringDictionary[Any], Unit], 
/* error */ js.Function1[/* errorText */ String, Unit], 
/* progress */ ProgressServerConfigFunction, 
/* abort */ js.Function0[Unit], 
/* transfer */ js.Function1[/* transferId */ String, Unit], 
/* options */ ProcessServerChunkTransferOptions, 
Unit]

type ProgressServerConfigFunction = js.Function3[
/* isLengthComputable */ Boolean, 
/* loadedDataAmount */ Double, 
/* totalDataAmount */ Double, 
Unit]

type RemoveServerConfigFunction = js.Function3[
/* source */ Any, 
/* load */ js.Function0[Unit], 
/* error */ js.Function1[/* errorText */ String, Unit], 
Unit]

type RestoreServerConfigFunction = js.Function6[
/* uniqueFileId */ Any, 
/* load */ js.Function1[/* file */ ActualFileObject, Unit], 
/* error */ js.Function1[/* errorText */ String, Unit], 
/* progress */ ProgressServerConfigFunction, 
/* abort */ js.Function0[Unit], 
/* headers */ js.Function1[/* headersString */ String, Unit], 
Unit]

type RevertServerConfigFunction = js.Function3[
/* uniqueFieldId */ Any, 
/* load */ js.Function0[Unit], 
/* error */ js.Function1[/* errorText */ String, Unit], 
Unit]
