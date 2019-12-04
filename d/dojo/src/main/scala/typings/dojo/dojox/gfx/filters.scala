package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/filters.html
  *
  * A module that defines a minimal API to create SVG filter definition objects to be used with the
  * dojox/gfx/svgext/Shape.setFilter() API, as well as a set of predefined filters.
  * The module defines the following API:
  * - filters.createFilter(config, primitives) : Creates a filter object from the specified config and the
  * given filter primitives.
  * - a set of methods to create the corresponding SVG filter primitives, based on the same
  * naming as the specification (e.g. filters.feGaussianBlur() ). A filter primitive method follows the
  * following signature (taking feGaussianBlur as an example):
  *     filters.feGaussianBlur(properties, children?)
  *     filters.feGaussianBlur(children)
  * The "properties" parameter must define the primitive attributes as defined by the specification.
  * The "children" array parameter is an array of child filter primitives.
  * In addition to this API, the module provides the following predefined filters:
  * - filters.convolutions.boxBlur3,
  * - filters.convolutions.boxBlur5,
  * - filters.convolutions.verticalEdges,
  * - filters.convolutions.horizontalEdges,
  * - filters.convolutions.allEdges3,
  * - filters.convolutions.edgeEnhance,
  * - filters.shadows.fastSmallDropShadow,
  * - filters.shadows.fastDropShadow,
  * - filters.shadows.fastDropShadowLight,
  * - filters.shadows.dropShadow,
  * - filters.shadows.dropShadowLight,
  * - filters.shadows.smallDropShadow,
  * - filters.shadows.smallDropShadowLight,
  * - filters.blurs.blur1,
  * - filters.blurs.blur2,
  * - filters.blurs.blur4,
  * - filters.blurs.blur8,
  * - filters.blurs.glow,
  * - filters.colors.negate,
  * - filters.colors.sepia,
  * - filters.colors.grayscale,
  * - filters.colors.showRed,
  * - filters.colors.showGreen,
  * - filters.colors.showBlue,
  * - filters.colors.hueRotate60,
  * - filters.colors.hueRotate120,
  * - filters.colors.hueRotate180,
  * - filters.colors.hueRotate270,
  * - filters.miscs.thinEmbossDropShadow,
  * - filters.miscs.embossDropShadow,
  * - filters.miscs.largeEmbossDropShadow,
  * - filters.miscs.thinEmbossDropShadowLight,
  * - filters.miscs.embossDropShadowLight,
  * - filters.miscs.largeEmbossDropShadowLight,
  * - filters.miscs.fuzzy,
  * - filters.miscs.veryFuzzy,
  * - filters.miscs.melting,
  * - filters.miscs.impressionist,
  * - filters.miscs.holes,
  * - filters.miscs.holesComplement,
  * - filters.reliefs.bumpIn,
  * - filters.reliefs.bumpOut,
  * - filters.reliefs.thinEmboss,
  * - filters.reliefs.emboss,
  * - filters.reliefs.largeEmboss,
  * - filters.textures.paper,
  * - filters.textures.swirl,
  * - filters.textures.swirl2,
  * - filters.textures.gold
  * Note: the dojox/gfx/tests/test_filter.html test shows the rendering of all the predefined filters.
  *
  */
trait filters extends js.Object

