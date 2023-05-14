organization := "org.scalablytyped"
name := "fontagon"
version := "1.1-dt-20211202Z-bfc3a9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "svg2ttf" % "5.0-dt-20211202Z-1fb03b",
  "org.scalablytyped" %%% "svgicons2svgfont" % "10.0-dt-20211202Z-725726",
  "org.scalablytyped" %%% "ttf2woff" % "2.0-dt-20211202Z-6816f9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
