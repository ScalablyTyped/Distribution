package typings.dojo.dojo.base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.dojox.html
  *
  *
  */
trait dojox extends js.Object {
  /**
    *
    */
  var BidiComplex: js.Object
  /**
    *
    */
  var analytics: js.Object
  /**
    *
    */
  var app: js.Object
  /**
    *
    */
  var atom: js.Object
  /**
    *
    */
  var av: js.Object
  /**
    *
    */
  var calc: js.Object
  /**
    *
    */
  var calendar: js.Object
  /**
    *
    */
  var charting: js.Object
  /**
    *
    */
  var collections: js.Object
  /**
    *
    */
  var color: js.Object
  /**
    *
    */
  var css3: js.Object
  /**
    *
    */
  var data: js.Object
  /**
    *
    */
  var date: js.Object
  /**
    *
    */
  var dgauges: js.Object
  /**
    *
    */
  var dnd: js.Object
  /**
    *
    */
  var drawing: js.Object
  /**
    *
    */
  var dtl: js.Object
  /**
    *
    */
  var editor: js.Object
  /**
    *
    */
  var embed: js.Object
  /**
    *
    */
  var encoding: js.Object
  /**
    *
    */
  var enhanced: js.Object
  /**
    * Utilities to embed and communicate with the Flash player from Javascript
    *
    */
  var flash: js.Object
  /**
    *
    */
  var form: js.Object
  /**
    *
    */
  var fx: js.Object
  /**
    *
    */
  var gantt: js.Object
  /**
    *
    */
  var gauges: js.Object
  /**
    *
    */
  var geo: js.Object
  /**
    *
    */
  var gesture: js.Object
  /**
    *
    */
  var gfx: js.Object
  /**
    *
    */
  var gfx3d: js.Object
  /**
    *
    */
  var grid: js.Object
  /**
    *
    */
  var help: js.Object
  /**
    *
    */
  var highlight: js.Object
  /**
    *
    */
  var html: js.Object
  /**
    *
    */
  var image: js.Object
  /**
    *
    */
  var io: js.Object
  /**
    *
    */
  var jq: js.Object
  /**
    *
    */
  var json: js.Object
  /**
    *
    */
  var jsonPath: js.Object
  /**
    *
    */
  var lang: js.Object
  /**
    *
    */
  var layout: js.Object
  /**
    *
    */
  var math: js.Object
  /**
    *
    */
  var mdnd: js.Object
  /**
    *
    */
  var mobile: js.Object
  /**
    *
    */
  var mvc: js.Object
  /**
    *
    */
  var openlayers: js.Object
  /**
    *
    */
  var rails: js.Object
  /**
    *
    */
  var robot: js.Object
  /**
    *
    */
  var rpc: js.Object
  /**
    *
    */
  var secure: js.Object
  /**
    *
    */
  var sketch: js.Object
  /**
    *
    */
  var sql: js.Object
  /**
    *
    */
  var string: js.Object
  /**
    *
    */
  var testing: js.Object
  /**
    *
    */
  var timing: js.Object
  /**
    *
    */
  var treemap: js.Object
  /**
    *
    */
  var uuid: js.Object
  /**
    *
    */
  var validate: js.Object
  /**
    *
    */
  var widget: js.Object
  /**
    *
    */
  var xml: js.Object
  /**
    * Provides a simple socket connection using WebSocket, or alternate
    * communication mechanisms in legacy browsers for comet-style communication. This is based
    * on the WebSocket API and returns an object that implements the WebSocket interface:
    * http://dev.w3.org/html5/websockets/#websocket
    * Provides socket connections. This can be used with virtually any Comet protocol.
    *
    * @param argsOrUrl This uses the same arguments as the other I/O functions in Dojo, or aURL to connect to. The URL should be a relative URL in order to properlywork with WebSockets (it can still be host relative, like //other-site.org/endpoint)
    */
  def socket(argsOrUrl: js.Object): js.Any
  /**
    *
    * @param format
    * @param filler
    */
  def sprintf(format: String, filler: js.Any): Unit
}

object dojox {
  @scala.inline
  def apply(
    BidiComplex: js.Object,
    analytics: js.Object,
    app: js.Object,
    atom: js.Object,
    av: js.Object,
    calc: js.Object,
    calendar: js.Object,
    charting: js.Object,
    collections: js.Object,
    color: js.Object,
    css3: js.Object,
    data: js.Object,
    date: js.Object,
    dgauges: js.Object,
    dnd: js.Object,
    drawing: js.Object,
    dtl: js.Object,
    editor: js.Object,
    embed: js.Object,
    encoding: js.Object,
    enhanced: js.Object,
    flash: js.Object,
    form: js.Object,
    fx: js.Object,
    gantt: js.Object,
    gauges: js.Object,
    geo: js.Object,
    gesture: js.Object,
    gfx: js.Object,
    gfx3d: js.Object,
    grid: js.Object,
    help: js.Object,
    highlight: js.Object,
    html: js.Object,
    image: js.Object,
    io: js.Object,
    jq: js.Object,
    json: js.Object,
    jsonPath: js.Object,
    lang: js.Object,
    layout: js.Object,
    math: js.Object,
    mdnd: js.Object,
    mobile: js.Object,
    mvc: js.Object,
    openlayers: js.Object,
    rails: js.Object,
    robot: js.Object,
    rpc: js.Object,
    secure: js.Object,
    sketch: js.Object,
    socket: js.Object => js.Any,
    sprintf: (String, js.Any) => Unit,
    sql: js.Object,
    string: js.Object,
    testing: js.Object,
    timing: js.Object,
    treemap: js.Object,
    uuid: js.Object,
    validate: js.Object,
    widget: js.Object,
    xml: js.Object
  ): dojox = {
    val __obj = js.Dynamic.literal(BidiComplex = BidiComplex.asInstanceOf[js.Any], analytics = analytics.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], atom = atom.asInstanceOf[js.Any], av = av.asInstanceOf[js.Any], calc = calc.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], charting = charting.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], css3 = css3.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dgauges = dgauges.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], drawing = drawing.asInstanceOf[js.Any], dtl = dtl.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], enhanced = enhanced.asInstanceOf[js.Any], flash = flash.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], fx = fx.asInstanceOf[js.Any], gantt = gantt.asInstanceOf[js.Any], gauges = gauges.asInstanceOf[js.Any], geo = geo.asInstanceOf[js.Any], gesture = gesture.asInstanceOf[js.Any], gfx = gfx.asInstanceOf[js.Any], gfx3d = gfx3d.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], io = io.asInstanceOf[js.Any], jq = jq.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], jsonPath = jsonPath.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], math = math.asInstanceOf[js.Any], mdnd = mdnd.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], mvc = mvc.asInstanceOf[js.Any], openlayers = openlayers.asInstanceOf[js.Any], rails = rails.asInstanceOf[js.Any], robot = robot.asInstanceOf[js.Any], rpc = rpc.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], sketch = sketch.asInstanceOf[js.Any], socket = js.Any.fromFunction1(socket), sprintf = js.Any.fromFunction2(sprintf), sql = sql.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], testing = testing.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any], treemap = treemap.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any], widget = widget.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[dojox]
  }
}

