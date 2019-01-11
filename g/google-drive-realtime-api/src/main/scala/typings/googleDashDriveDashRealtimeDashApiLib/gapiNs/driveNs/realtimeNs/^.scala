package typings
package googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.drive.realtime")
@js.native
object ^ extends js.Object {
  val ErrorType: googleDashDriveDashRealtimeDashApiLib.Anon_CLIENTERROR = js.native
  val EventType: googleDashDriveDashRealtimeDashApiLib.Anon_ATTRIBUTECHANGED = js.native
  def debug(): scala.Unit = js.native
  def load(fileId: java.lang.String): scala.Unit = js.native
  def load(
    fileId: java.lang.String,
    onLoaded: js.Function1[
      /* d */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def load(
    fileId: java.lang.String,
    onLoaded: js.Function1[
      /* d */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document, 
      scala.Unit
    ],
    opt_initializerFn: js.Function1[
      /* m */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Model, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def load(
    fileId: java.lang.String,
    onLoaded: js.Function1[
      /* d */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document, 
      scala.Unit
    ],
    opt_initializerFn: js.Function1[
      /* m */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Model, 
      scala.Unit
    ],
    opt_errorFn: js.Function1[
      /* e */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Error, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def loadAppDataDocument(
    onLoaded: js.Function1[
      /* x */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def loadAppDataDocument(
    onLoaded: js.Function1[
      /* x */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document, 
      scala.Unit
    ],
    opt_initializerFn: js.Function1[
      /* x */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Model, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def loadAppDataDocument(
    onLoaded: js.Function1[
      /* x */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document, 
      scala.Unit
    ],
    opt_initializerFn: js.Function1[
      /* x */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Model, 
      scala.Unit
    ],
    opt_errorFn: js.Function1[
      /* e */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Error, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def loadFromJson(json: java.lang.String): googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document = js.native
  def loadFromJson(
    json: java.lang.String,
    opt_errorFn: js.Function1[
      /* e */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Error, 
      scala.Unit
    ]
  ): googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document = js.native
  def newInMemoryDocument(): googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document = js.native
  def newInMemoryDocument(
    opt_onLoaded: js.Function1[
      /* d */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document, 
      scala.Unit
    ]
  ): googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document = js.native
  def newInMemoryDocument(
    opt_onLoaded: js.Function1[
      /* d */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document, 
      scala.Unit
    ],
    opt_initializerFn: js.Function1[
      /* m */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Model, 
      scala.Unit
    ]
  ): googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document = js.native
  def newInMemoryDocument(
    opt_onLoaded: js.Function1[
      /* d */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document, 
      scala.Unit
    ],
    opt_initializerFn: js.Function1[
      /* m */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Model, 
      scala.Unit
    ],
    opt_errorFn: js.Function1[
      /* e */ googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Error, 
      scala.Unit
    ]
  ): googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document = js.native
}

