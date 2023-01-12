organization := "org.scalablytyped"
name := "fontagon"
version := "1.1-dt-20211202Z-892131"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "svg2ttf" % "5.0-dt-20211202Z-2e0cdc",
  "org.scalablytyped" %%% "svgicons2svgfont" % "10.0-dt-20211202Z-5559c2",
  "org.scalablytyped" %%% "ttf2woff" % "2.0-dt-20211202Z-879c09")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
